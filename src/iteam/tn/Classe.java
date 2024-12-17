package iteam.tn;

public class Classe {
    private String libelle;
    private int capacite;


    public Classe() {
    }

    public Classe(String libelle, int capacite) {
        this.libelle = libelle;
        this.capacite = capacite;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
}
