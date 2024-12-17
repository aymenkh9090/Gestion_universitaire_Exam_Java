package iteam.tn;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class University {

    private String nom;
    private Map<Classe, EnsembleEtudiants> university;

    public University(){
        university = new HashMap<>();
    }
    public void ajouterClase(Classe classe){
        university.put(classe,new EnsembleEtudiants());
    }
    public void ajouterEtudiant(Etudiant e , Classe c){
        if(university.containsKey(c)){
            university.get(c).ajouterEtudiant(e);
        }
        else{
            EnsembleEtudiants etudiants = new EnsembleEtudiants();
            etudiants.ajouterEtudiant(e);
            university.put(c,etudiants);
        }
    }

    public void deplacerEtudiant(Etudiant e , Classe classeDestination){
        for(EnsembleEtudiants se : university.values()){
            if(se.chercherEtudiant(e)){
                se.supprimerEtudiant(e);
            }

        }
        university.get(classeDestination).ajouterEtudiant(e);
    }

    public void permuterEtudiant(Etudiant e1 , Etudiant e2){
        Classe c1=null,c2=null;
        for(Classe c: university.keySet()){
            if(university.get(c).chercherEtudiant(e1)){
                c1=c;
            }
            if(university.get(c).chercherEtudiant(e2)){
                c2=c;
            }
            if(c!=null && c2!=null){
                break;
            }
        }
        university.get(c1).ajouterEtudiant(e2);
        university.get(c1).supprimerEtudiant(e1);
        university.get(c2).ajouterEtudiant(e1);
        university.get(c2).supprimerEtudiant(e2);
    }

    public void afficherUniverity(){
        university.forEach((k,v)->{
            System.out.println(k);
            v.afficher();
        });
    }

    public void afficherNomEtudiantsAge(Classe c){
        university.get(c).etudiants.stream()
                .filter(e->e.getAge()>20 && e.getAge()<23)
                .forEach(System.out::println);
    }







}
