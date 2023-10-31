import exceptions.EtudiantExisteException;
import models.Ecole;
import models.Etudiant;
import models.Etudiant3Eme;
import models.EtudiantAlternance;

public class Main {
    public static void main(String[] args) {

        //Ecoles
        Ecole esprit = new Ecole("ESPRIT");
        Ecole esb = new Ecole("ESPRIT Business");
        Ecole Teckup = new Ecole("Teckup");

        //Etudiants
        Etudiant e1 = new Etudiant3Eme(1, "Khaled", "Guedria", 14.0f, "TIC");
        Etudiant e2 = new Etudiant3Eme(2, "Leo", "Messi", 19.75f, "Reseau");
        Etudiant e3 = new Etudiant3Eme(3, "Steven", "Gerrard", 10.0f, "DS");
        //..
        Etudiant e4 = new EtudiantAlternance(4, "Khabib", "Nurmagomedov", 13.80f, 5000);
        Etudiant e5 = new EtudiantAlternance(5, "Islem", "Makhachev", 11.30f, 3500);
        Etudiant e6 = new EtudiantAlternance(6, "Mohamed", "Salah", 10.50f, 75000);

        //Tests
        try {
            esprit.ajouterEtudiant(e1);
            esprit.ajouterEtudiant(e2);
            esprit.ajouterEtudiant(e3);
            esprit.ajouterEtudiant(e4);
            esprit.ajouterEtudiant(e5);
            System.out.println(esprit);
            esprit.changerEcole(e1, esb);
        } catch (EtudiantExisteException e) {
            e.printStackTrace();
        }finally {
            System.out.println(esprit);
            System.out.println(esb);
        }
    }
}