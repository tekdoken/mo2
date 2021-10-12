package bai4;

public class Fan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        fan2.setSpeed(MEDIUM);
        fan2.setColor("blue");
        System.out.println(fan1);
        System.out.println(fan2);
    }

    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        if (this.on) {
            return "Fan :{" + "speed=" + speed + ", radius=" + radius + ", color='" + color + "', fan is on}";
        } else {
            return "Fan :{" + " radius=" + radius + ", color='" + color + "' ,fan is off}";
        }

    }

}
