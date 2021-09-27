package makhlouf.shapesandperimeters;

import java.awt.*;

public class TestMain {
    public static void main(String[] args) {
        Square square =  new Square("red",10.0);
        Rectangle  rectangle = new Rectangle("yellow",12.5,15.1);
        Triangle triangle = new Triangle("black",12,9,8,6);
        Circle circle = new Circle("red", 6.2);

         square.getPerimeter();
         square.getArea();
         square.getColor();
        System.out.println("*******************************");
        System.out.println("*******************************");
         rectangle.getArea();
         rectangle.getColor();
         rectangle.getPerimeter();
        System.out.println("*******************************");
        System.out.println("*******************************");
         triangle.getArea();
        triangle.getPerimeter();
        triangle.getColor();
        System.out.println("*******************************");
        System.out.println("*******************************");
        circle.getArea();
        circle.getColor();
        circle.getPerimeter();


    }
}
