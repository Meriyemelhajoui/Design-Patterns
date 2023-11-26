package Adapter;


import java.util.ArrayList;
import java.util.List;

// cette classe joue le role d une administration qui est responsable d acceullir les eleves , et prendre d eux les Documents Necessaires pour les enregistrer
public class StudentAdministration {
    public List<Student> getStudentList(){
        // cette liste sert a regrouper les eleves
        List<Student> studentList= new ArrayList<>();
        StudentClass studentofClass= new StudentClass("Meryem","EL HAJOUI","meriyemelhajoui@gmail.com");
        // maintenant on va creer un eleve de College , donc il n est pas adapte avec les autres etudiants

        CollegeStudent studentofCollege= new CollegeStudent("Sanae","Errahimi","sanaerrahimi@gmail.com");
        studentList.add(studentofClass);
        //studentList.add(studentofCollege); // Ici on ne peut pas ajouter un college student qui n est pas de Type Student , d ou on va l ajouter en creeant un Adapteur

        // on ne va pas ajouter directement un objet de Type College mais un objet adapter
        studentList.add(new StudentAdapter(studentofCollege)); // et Voilaaaaaaaaaaa
      return studentList;
    }


}
