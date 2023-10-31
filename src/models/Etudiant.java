package models;

public abstract class Etudiant {
    //var
    protected int identiant;
    protected String nom, prenom;
    protected float moyenne;

    //Constructor

    public Etudiant() {
    }

    public Etudiant(int identiant, String nom, String prenom, float moyenne) {
        this.identiant = identiant;
        this.nom = nom;
        this.prenom = prenom;
        this.moyenne = moyenne;
    }

    //Getters and setters
    public int getIdentiant() {
        return identiant;
    }

    public void setIdentiant(int identiant) {
        this.identiant = identiant;
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

    public float getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne;
    }

    //Methods
    public abstract void ajouterAbsence();

    //Equals
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Etudiant e){
            return (this.identiant == e.identiant && this.nom.equals(e.nom));
        }
        return false;
    }

    //Display
    @Override
    public String toString() {
        return "Etudiant{" +
                "identiant=" + identiant +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", moyenne=" + moyenne +
                '}';
    }
}
