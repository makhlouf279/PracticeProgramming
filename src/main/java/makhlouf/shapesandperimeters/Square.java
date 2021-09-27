package makhlouf.shapesandperimeters;

public class Square extends Shape{
private  double edge;

    public Square(String color, double edge) {
        super(color);
        this.edge = edge;
    }

    @Override
    public void getColor() {
        super.getColor();

    }

    @Override
    public void getPerimeter() {
        super.getPerimeter();
        System.out.println(this.edge*4);
    }

    @Override
    public void getArea() {
        super.getArea();
        System.out.println(Math.pow(this.edge,2));
    }
}
