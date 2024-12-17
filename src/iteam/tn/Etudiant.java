package iteam.tn;

import java.util.Objects;

public class Etudiant {



    private String nom;
    private int cin;
    private int age;
    private double moyenne;

    public Etudiant(){

    }

    public Etudiant(String nom, int cin, int age, double moyenne) {
        this.nom = nom;
        this.cin = cin;
        this.age = age;
        this.moyenne = moyenne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    //TO DO 1:

    @Override
    public boolean equals(Object obj){
        if(obj==null)
            return false;
        if(obj instanceof Etudiant){
            final Etudiant other = (Etudiant) obj;
            return nom.equals(other.nom);
        }
        return false;
    }
    @Override
    public String toString(){
        return "Student{"+"nom="+nom+",cin="+cin+",age="+age+",moyenne="+moyenne+"}";
    }
    @Override
    public int hashCode(){
        int hash=3;
        hash=67*hash+ Objects.hashCode(this.nom);
        hash=67*hash+this.cin;
        return hash;
    }
















}
