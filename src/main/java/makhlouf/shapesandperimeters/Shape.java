package makhlouf.shapesandperimeters;

abstract class Shape {
private  String color;

    public Shape(String color) {
        this.color = color;
    }

    public void getColor() {
        System.out.println(this.color);
    }

    public void getArea(){
    }
    public  void getPerimeter(){

    }
}
