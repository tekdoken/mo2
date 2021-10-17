package bai7.Resizeable;

public class Square extends Shape implements Resizeable {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = 0;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;

    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    public double getPerimeter() {
        return this.side * 4;
    }

    @Override
    public void resize(double percent) {
        this.side = side + ((side / 100) * percent);
        System.out.println(side);
    }

    @Override
    public void resizeRan() {
        side = side + (side / 100) * ((Math.random()) * (100 - 1) + 1);
        System.out.println(side);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}