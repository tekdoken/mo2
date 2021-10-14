package bai6.ThucHanh;

public class Rectangle extends Shape {
    double width;
    double length;

    public Rectangle() {
        this.length = 1;
        this.width = 2;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double setArea(double width,double length) {
      return this.length*this.width;
    }
    public double getPerimeter(double length,double width){
      return  (this.length+this.width)*2;
    }
    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }

}
