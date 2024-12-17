package iteam.tn;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class EnsembleEtudiants implements IEtudiantSerice<Etudiant>{

    public Set<Etudiant> etudiants;

    public EnsembleEtudiants(){
        etudiants = new HashSet<>();
    }
    @Override
    public void ajouterEtudiant(Etudiant etudiant) {

        etudiants.add(etudiant);
    }

    @Override
    public void supprimerEtudiant(Etudiant etudiant) {


        etudiants.remove(etudiant);
    }

    @Override
    public boolean chercherEtudiant(Etudiant e) {
        //methode 1
        //return etudiants.contains(e);

        // method2 avec stream
         return etudiants.stream()
                .anyMatch(elt->elt.equals(e));
    }

    @Override
    public boolean chercherEtudiant(int cin) {
        return etudiants.stream()
                .anyMatch(elt->elt.getCin()==cin);
    }

    @Override
    public void afficher() {

        etudiants.forEach(System.out::println);
    }

    @Override
    public TreeSet<Etudiant> trierEtudiantsNom() {
        return etudiants.stream()
              .collect(Collectors.toCollection(()->new TreeSet<>((e1,e2)->e1.getNom().compareTo(e2.getNom()))));

    }

    public double sommeDesMoyennes(){
        double somme =
                etudiants.stream()
                        .mapToDouble(e->e.getMoyenne())
                        .sum();
        return somme;
    }


}

