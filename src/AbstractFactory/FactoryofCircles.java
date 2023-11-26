package AbstractFactory;

public class FactoryofCircles implements AbstractFactory{
    @Override
    public Shape CreateShape(String type ) {
        switch (type){
            case "Circle2D":
                return new Circle2D();
            case "Circle3D":
                return  new Circle3D();
            default:
                return null;
        }
    }
    // this factory is responsable for creation of Circle objects : all the types possible for Circle 2D , 3D




}
