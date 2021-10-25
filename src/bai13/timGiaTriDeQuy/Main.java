package bai13.timGiaTriDeQuy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập so: ");
        int num = input.nextInt();
        int ar[] = new int[num];
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            ar[i] = input.nextInt();
        }
        System.out.println("nhập phần tử cần tìm:");
        int value = input.nextInt();
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        int r = binarySearch(ar, 0, num, value);
        System.out.println("số "+value+" có vị trí là "+r);
    }

    public static int binarySearch(int[] ar, int left, int right, int value) {
        int mid = (left + right) / 2;

        if (right - left < 0) {
            return -1;
        }
        if (value == ar[mid]) {
            return mid;
        } else if (value >= ar[mid]) {
            return binarySearch(ar, mid + 1, right, value);
        } else {
            return binarySearch(ar, left, mid - 1, value);
        }

    }

}
