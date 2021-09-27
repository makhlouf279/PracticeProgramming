package makhlouf.shapesandperimeters;

public class Triangle extends Shape{
    private double a , b , c, h ;

    public Triangle(String color, double a, double b, double c, double h) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public void getColor() {
        super.getColor();
    }

    @Override
    public void getArea() {
        super.getArea();
        System.out.println((this.c*this.h)/2);
    }

    @Override
    public void getPerimeter() {
        super.getPerimeter();
        System.out.println(this.a+this.b+this.c);
    }
}
