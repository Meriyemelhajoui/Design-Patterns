package Adapter;


// cette classe sert a adapter les differents Types des eleves pour qu'il s integrent dans la classe
public class StudentAdapter implements Student{

    private CollegeStudent collegeStudent;

    // constructor
    StudentAdapter(CollegeStudent collegeStudent){
        this.collegeStudent=collegeStudent;
    }


    @Override
    public String getName() {
        return collegeStudent.getNom(); // on adapte le Nom de college Student avec Name
    }

    @Override
    public String getSurname() {
        return collegeStudent.getPrenom(); // Adaptation de prenom avec lastName
    }

    @Override
    public String getEmail() {
        return collegeStudent.getEmail();
    }
}
