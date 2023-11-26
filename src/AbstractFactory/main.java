package AbstractFactory;

public class main {
    public static void main(String[] args) {
        // we gonna try to create instance of Circles //
        /// since we have a factory for every type so we gonna instanite the type of Factory first
        AbstractFactory circlefactory= new FactoryofCircles();
        Shape c1=circlefactory.CreateShape("Circle2D");
        c1.draw();
        Shape c11=circlefactory.CreateShape("Circle3D");
        c11.draw();

     // first let s create the Factory of Triangle
        AbstractFactory triangleFactory= new FactoryofTriangle();
        Shape t1=triangleFactory.CreateShape("Triangle3D");
         t1.draw();

    }
}
