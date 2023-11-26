package AbstractFactory;


// This is the large type of circle , that we will extends from the circle1d and circle2d ...
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("I am a circle");

    }
}
