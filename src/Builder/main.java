package Builder;

public class main {
    public static void main(String[] args) {
        // Exemple of utilisation of Design Pattern Builder
            // on accede a la classe Interne Builder a travers le nom de classe Globale ;
            Employee e1= new Employee.Builder().name("Meryem").lastname("ELHajoui").age(21).build();
            System.out.println(e1);
            Employee e2= new Employee.Builder().animal("Swowy mami").build(); // build() qui permet de builder l objet avec les attributs Voulues
            System.out.println(e2);

    }
}
