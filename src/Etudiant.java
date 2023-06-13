public class Etudiant {
    // proprieté de l'etudiant
    private String nom;
    private int age ;
    private String niveau;


    // constructeur de la classe etudiant
    public Etudiant(String nom, int age, String niveau) {
        this.nom = nom;
        this.age = age;
        this.niveau = niveau;
    }

    // Méthodes pour afficher les informations de l'etudiant
    public void afficherInformation(){
        System.out.println("Nom de l'etudint : " + nom );
        System.out.println("L'age de l'etudiant : " + age);
        System.out.println("Le niveau de l'etudiant : " + niveau);
    }
    public void etudier() {
        System.out.println(nom + " étudie !");
    }

    public void etudier2() {
        System.out.println(nom + " n'etudie pas !");
    }

    public String getNiveau(){
        return niveau;
    }

    public void age1() {
        System.out.println(nom + " est adulte.");
        System.out.println("********************************************");
    }

    public void age2() {
        System.out.println(nom + " est mineur.");
        System.out.println("********************************************");
    }

    public int getAge() {
    return age;
    }

}
