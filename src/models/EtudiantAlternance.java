package models;

public class EtudiantAlternance extends Etudiant{
    //var
    private int salaire;

    //Constructor
    public EtudiantAlternance(int identiant, String nom, String prenom, float moyenne, int salaire){
        super(identiant, nom, prenom, moyenne);
        this.salaire = salaire;
    }


    //Getters and setters
    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    @Override
    public void ajouterAbsence() {
        this.salaire -= 50;
    }

    //Display

    @Override
    public String toString() {
        return "EtudiantAlternance{" +
                "salaire=" + salaire +
                ", identiant=" + identiant +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", moyenne=" + moyenne +
                '}';
    }
}


