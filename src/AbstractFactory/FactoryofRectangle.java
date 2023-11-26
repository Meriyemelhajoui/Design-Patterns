package AbstractFactory;

public class FactoryofRectangle implements AbstractFactory{
    @Override
    public Shape CreateShape(String type) {
        if(type.equals("Rectangle2D")){
            return new Rectangle2D();
        }else {
            return null;
        }
    }
}
