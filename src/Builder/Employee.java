package Builder;

// in this class we gonna implement the Builder Design Pattern qui permet de creer des objets qui sont complexes en termes de Nombre de parametres
// donc au lieu qu'on aura 50 constructeurs , on va custumiser la creation des objets selon le choix de client
public class Employee {

    // Les attributs Prives pour assurer qu'ils ne seront pas Accessible depuis l exterieur
    private String name;
    private String lastname;
    private String statut;
    private String animal;
    private int age;

    private Employee(String n ,String l , String s , String an,int a){
        this.name=n;
        this.lastname=l;
        this.animal=an;
        this.statut=s;
        this.age=a;
    }
    @Override
    public String toString() {
        return "Builder{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", statut='" + statut + '\'' +
                ", animal='" + animal + '\'' +
                ", age=" + age +
                '}';
    }

    // Builder class est une classe Interne
    public static class Builder{
        // une bonne pratique de reecrire l ensemble des Attributs

        private String name;
        private String lastname;
        private String statut;
        private String animal;
        private int age;

        // creation des Setters qui retourne le Meme Objet Builder
        public Builder name(String name){
            this.name=name;
            return this;

        }

        public Builder lastname(String lastname){
            this.lastname=lastname;
            return this;

        }
        public Builder statut(String statut){
            this.statut=statut;
            return this;

        }
        public Builder animal(String animal){
            this.animal=animal;
            return this;

        }
        public Builder age(int  age){
            this.age=age;
            return this;

        }

        // Methode qui permet de Faire le Build
        public Employee build(){
            return new Employee(this.name,this.lastname,this.statut,this.animal,this.age);
        }




    }





}
