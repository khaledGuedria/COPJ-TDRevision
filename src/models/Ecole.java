package models;

import exceptions.EtudiantExisteException;

import java.util.Arrays;

public class Ecole {
    //var
    private String nom;

    private Etudiant[] etudiants;
    private int nbr_etudiants = 0;

    //const
    final int MAX_ETUDIANTS = 500;

    //Constructor
    public Ecole(String nom){
        this.nom = nom;
        this.etudiants = new Etudiant[MAX_ETUDIANTS];
    }

    //Getters and setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    //Methods
    //Add student
    public void ajouterEtudiant(Etudiant e) throws EtudiantExisteException{
        if (nbr_etudiants < MAX_ETUDIANTS) {
            if(rechercherEtudiant(e) == -1){
                etudiants[nbr_etudiants] = e;
                nbr_etudiants++;
            }else{
                throw new EtudiantExisteException();
            }
        }
    }
    //Search student
    public int rechercherEtudiant (Etudiant e){
        for (int i=0; i< nbr_etudiants; i++) {
            if(etudiants[i].equals(e)){
                return i;
            }
        }
        return -1;
    }
    //Calculate 3A average
    public float calculerMoyenne3A(){
        float sum = 0;
        int nbr3A = 0;
        for (Etudiant e: etudiants) {
            if(e instanceof Etudiant3Eme e3e){
                sum += e3e.getMoyenne();
                nbr3A++;
            }
        }
        return sum/nbr3A;
    }
    //Calcule Atlernance salaire moyenne
    public float calculerMoyenneSalaires(){
        float sum = 0;
        int nbrAlt = 0;
        for (Etudiant e: etudiants) {
            if(e instanceof EtudiantAlternance ealt){
                sum += ealt.getSalaire();
                nbrAlt++;
            }
        }
        return sum/nbrAlt;
    }

    //supprimer etudiant
    public void supprimerEtudiant(Etudiant e) {
        int index = rechercherEtudiant(e);
        etudiants[index] = null;

        for (int i = index; i < nbr_etudiants; i++) {
            etudiants[i] = etudiants[i+1];
        }
        etudiants[nbr_etudiants] = null;
        nbr_etudiants--;
    }

    //ChangerEcole
    public void changerEcole(Etudiant etd, Ecole e){
        try {
            e.ajouterEtudiant(etd);
        } catch (EtudiantExisteException ex) {
            ex.printStackTrace();
        }
        this.supprimerEtudiant(etd);
    }

    //Display
    @Override
    public String toString() {
        return "Ecole{" +
                "nom='" + nom + '\'' +
                ", etudiants=" + Arrays.toString(etudiants) +
                '}';
    }
}
