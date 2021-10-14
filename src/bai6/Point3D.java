package bai6;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setX(float x) {
        super.setX(x);
    }
    public void setY(float y) {
        super.setY(y);
    }

    public float getX() {
        return super.getX();
    }

    public float getY() {
        return super.getY();
    }

    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(),getY(),z};
    }

    @Override
    public String toString() {
        return "Point3D{" + "x=" + getX() +
                ", y=" + getY() +
                " , z=" + z +
                '}';
    }
}
