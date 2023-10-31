package models;

public class Etudiant3Eme extends Etudiant{
    //var
    private String branche;

    //Constructor
    public Etudiant3Eme(int identiant, String nom, String prenom, float moyenne, String branche){
        super(identiant, nom, prenom, moyenne);
        this.branche = branche;
    }


    //Getters and setters
    public String getBranche() {
        return branche;
    }

    public void setBranche(String branche) {
        this.branche = branche;
    }

    //Methods
    @Override
    public void ajouterAbsence() {
        this.moyenne -= 0.5;
    }
}
