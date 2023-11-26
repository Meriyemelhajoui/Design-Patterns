package Factory;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Let s try the Design Factory : Pattern de Creation

        Shape sh1= Factory.getShape("Circle");
        sh1.draw();
        Shape sh2= Factory.getShape("Triangle");
        sh2.draw();
        Shape sh3= Factory.getShape("Rectangle");
        sh3.draw();
    }
}