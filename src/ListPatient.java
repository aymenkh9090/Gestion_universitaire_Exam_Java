import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.List;


public class ListPatient implements InterfacePatient<Patient>{


    private List<Patient> listP;
    public ListPatient(){
        listP = new ArrayList<>();
    }

    @Override
    public void ajouterPatient(Patient patient) {
        listP.add(patient);

    }

    @Override
    public void supprimerPatient(Patient patient) {

        listP.remove(patient);
    }

    @Override
    public boolean rechercherPatient(Patient patient) {


        
        return listP.stream()
                .anyMatch(p->p.equals(patient));

    }

    @Override
    public boolean rechercherPatientByCin(int cin) {

        return listP.stream()
                .anyMatch(p->p.getCin()==cin);
    }

    @Override
    public void afficherPatient() {

        listP.stream()
                .forEach(System.out::println);
    }

    @Override
    public void trierPatientsParNom() {


        listP.stream()

               .sorted((a,b)->a.getNom().compareTo(b.getNom()));





    }

    @Override
    public void patientSansRendondance() {
        listP.stream()
                .distinct()
                .forEach(System.out::println);
    }


    public static void main(String[] args) {

        ListPatient lp = new ListPatient();
        lp.ajouterPatient(new Patient(1,"aaa","bbb",0147));
        lp.ajouterPatient(new Patient(7,"ddd","bbb",047));
        lp.ajouterPatient(new Patient(4,"ada","bbb",01));
        lp.ajouterPatient(new Patient(58,"maa","bbb",0147));
        lp.ajouterPatient(new Patient(7,"ddd","bbb",047));


        System.out.println(lp.rechercherPatientByCin(047));
        lp.trierPatientsParNom();
        lp.afficherPatient();







    }

















}
