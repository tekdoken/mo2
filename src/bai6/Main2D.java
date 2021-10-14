package bai6;

import java.util.Arrays;

public class Main2D {
    public static void main(String[] args) {
        Point2D point2D=new Point2D(5,5);
        System.out.println(point2D);
        Point3D point3D=new Point3D(8,8,8);
        System.out.println(point3D);
        point3D.setXYZ(3,4,5);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
