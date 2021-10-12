package bai1;

import java.util.Scanner;

public class Cannang {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("nhap can nang");
        weight = sa.nextDouble();
        System.out.print("nhap chieu cao");
        height = sa.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}

