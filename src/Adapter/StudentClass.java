package Adapter;

public class StudentClass implements Student{
    private String name;
    private String lastname;
    private String email;


    public StudentClass(String name , String lastname , String email) {
        this.name = name;
        this.lastname=lastname;
        this.email=email;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSurname() {
        return this.lastname;
    }

    @Override
    public String getEmail() {
        return this.email;
    }
}
