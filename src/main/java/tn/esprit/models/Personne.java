package tn.esprit.models;

public class Personne {
    //attributs
    private int id, age;
    private String nom, prenom, adresse;

    //Contructeurs
    public Personne(){}
    public Personne(int age, String nom, String prenom, String adresse) {
        this.age = age;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }
    public Personne(int id, int age, String nom, String prenom, String adresse) {
        this.id = id;
        this.age = age;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    //Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


    //Display

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", age=" + age +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
