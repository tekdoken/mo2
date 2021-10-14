package bai6;

public class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color) {
        super(radius, color);
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public void setRadius(double radius) {
        super.setRadius(radius);
    }


    public void setColor(String color) {
        super.setColor(color);
    }


    public double CylindricalVolume(double radius){
        return this.height*Math.pow(getRadius(),2)*Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + getRadius() +
                ", height=" + height +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
