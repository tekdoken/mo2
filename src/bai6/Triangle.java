package bai6;

public class Triangle extends Shape {
    private double side1 = 1;
    private double side3 = 1;
    private double side2 = 1;

    public Triangle() {
    }

    public Triangle(double side1, double side3, double side2) {
        this.side1 = side1;
        this.side3 = side3;
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public void setSide123(double side1,double side2,double side3,String color){
        super.setColor(color);
        this.side2 = side2;
        this.side3 = side3;
        this.side1 = side1;

    }
    public double getArea() {
        return Math.sqrt(getPerimeter()/2*((getPerimeter() / 2) - side2) * ((getPerimeter() / 2) - side3) * ((getPerimeter() / 2) - side1));
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side3=" + side3 +
                ", side2=" + side2 + "Area= " + getArea() + "Perimeter= " + getPerimeter() +"color: "+super.getColor()+
                '}';
    }
}
