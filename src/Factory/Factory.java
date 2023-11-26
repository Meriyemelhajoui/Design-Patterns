package Factory;

public class Factory {
    // this factory is for creation of Objects
    public static Shape getShape(String form){
        switch(form){
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            case "Triangle":
                return new Triangle();
            default:
                throw new RuntimeException("This form is not available ");
        }

    }

}
