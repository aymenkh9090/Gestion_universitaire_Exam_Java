public class Patient {

    //attributs
    private int cin;
    private String nom,prenom;
    private int numSecuriteSociale;
    //constructeur
    public Patient(){

    }
    public Patient(int cin,String nom,String prenom,int numSecuriteSociale){
        this.cin=cin;
        this.nom=nom;
        this.prenom=prenom;
        this.numSecuriteSociale=numSecuriteSociale;
    }
    //setter and getter


    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNumSecuriteSociale() {
        return numSecuriteSociale;
    }

    public void setNumSecuriteSociale(int numSecuriteSociale) {
        this.numSecuriteSociale = numSecuriteSociale;
    }

    //toString
    @Override
    public String toString(){
        return "Patient: [ CIN : " + cin + " Nom: " + nom + " Prenom: " + prenom + " Numero securité sociale : " + numSecuriteSociale + "].";
    }
    //eqauls
    public boolean equals(Object obj){
        if(obj ==null){
            return false;
        }
        if(obj instanceof Patient)
        {
            Patient p = (Patient) obj;
            if(this.getCin()==((Patient) obj).cin && this.numSecuriteSociale == ((Patient) obj).numSecuriteSociale){
                return true;
            }

        }
        return false;
    }
































}
