package bai7.Resizeable;

public class Rectangle extends Shape implements Resizeable {
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

    public double getArea(double width,double length) {
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

    @Override
    public void resize(double percent) {
        width = width + ((width / 100) *  percent);
        length = length + ((length / 100) *  percent);
        System.out.println("chieu rong: "+width+"\n"+"chieu dai: "+length);
    }

    @Override
    public void resizeRan() {
        double r = ((Math.random()) * (100 - 1) + 1);
               width =width + (width / 100) * r ;
               length =length + (length / 100) * r ;

        System.out.println("chieu rong: "+width+"chieu dai: "+length);
    }
}
