package makhlouf.shapesandperimeters;

public class Rectangle extends Shape{
    private double hight;
    private double widht;

    public Rectangle(String color, double hight, double widht) {
        super(color);
        this.hight = hight;
        this.widht = widht;
    }

    @Override
    public void getColor() {
        super.getColor();
    }

    @Override
    public void getPerimeter() {
        super.getPerimeter();
        System.out.println(2*(this.hight+ this.widht));

    }

    @Override
    public void getArea() {
        super.getArea();
        System.out.println(this.hight*this.widht);
    }
}
