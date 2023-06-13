// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Création d'un etudiant
        Etudiant etudiant1 = new Etudiant("Aycem", 11, "Excellent");

        //Appel des méthodes sur l'objet etudiant
        etudiant1.afficherInformation();
        if (etudiant1.getNiveau().equals("Excellent")) {
            etudiant1.etudier();
            if (etudiant1.getAge()<18) {
                etudiant1.age2();
            }
            else
                etudiant1.age1();
        }
        else if (etudiant1.getNiveau().equals("Faible")) {
            etudiant1.etudier2();
            if (etudiant1.getAge()<18){
                etudiant1.age2();
            }
            else
                etudiant1.age1();
        }

        //Cration d'un aute etudiant
        Etudiant etudiant2 = new Etudiant("Saleh", 18, "Faible");

        //Appel des méthodes sur l'objet etudiant
        etudiant2.afficherInformation();
        if (etudiant2.getNiveau().equals("Excellent")) {
            etudiant2.etudier();
            if(etudiant2.getAge()<18) {
                etudiant2.age2();
            }
            else
                etudiant2.age1();
        }
        else if (etudiant2.getNiveau().equals("Faible")) {
            etudiant2.etudier2();
            if(etudiant2.getAge()<18) {
                etudiant2.age2();
            }
            else
                etudiant2.age1();
        }
    }
}