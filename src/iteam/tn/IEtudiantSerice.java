package iteam.tn;

import java.util.TreeSet;

public interface IEtudiantSerice<T>{

    void ajouterEtudiant(T t);
    void supprimerEtudiant(T t);
    boolean chercherEtudiant(Etudiant e);
    boolean chercherEtudiant(int cin);
    void afficher();
    TreeSet<Etudiant> trierEtudiantsNom();




}
