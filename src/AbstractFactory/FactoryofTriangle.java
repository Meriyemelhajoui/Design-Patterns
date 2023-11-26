package AbstractFactory;

public class FactoryofTriangle implements AbstractFactory{

    @Override
    public Shape CreateShape(String type) {
        if(type.equals("Triangle3D")){
            return  new Triangle3D();

        }else {
            return null;
        }
    }
}
