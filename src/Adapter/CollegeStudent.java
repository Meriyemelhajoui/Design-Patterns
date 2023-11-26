package Adapter;

public class CollegeStudent {
    private String nom;
    private String prenom;
    private String email;


    public CollegeStudent(String nom,String prenom , String email) {
        this.nom=nom;
        this.prenom=prenom;
        this.email = email;
    }

    public String getNom(){
        return this.nom;
    }

    public String getEmail() {
        return email;
    }

    public String getPrenom() {
        return prenom;
    }
}
