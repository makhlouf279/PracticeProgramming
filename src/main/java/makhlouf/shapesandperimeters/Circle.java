package makhlouf.shapesandperimeters;

public class Circle extends Shape{
    private double r;

    public Circle(String color, double r) {
        super(color);
        this.r = r;
    }

    @Override
    public void getColor() {
        super.getColor();
    }

    @Override
    public void getPerimeter() {
        super.getPerimeter();
        System.out.println(2*this.r* Math.PI);
    }

    @Override
    public void getArea() {
        super.getArea();
        System.out.println(Math.PI*Math.pow(this.r,2));
    }
}
