package bai7.Resizeable;

public class Circle extends Shape implements Resizeable {
    double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(double radius) {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter(double radius) {
        return this.radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        radius = radius + ((radius / 100) *  percent);
        System.out.println(radius);
    }

    @Override
    public void resizeRan() {
             radius = radius + (radius / 100) * ((Math.random()) * (100 - 1) + 1);
        System.out.println(radius);
    }
}
