package bai13.timGiaTriDeQuy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập so: ");
//        int num = input.nextInt();
        int ar[] = new int[10];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            ar[i] = input.nextInt();
        }
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        System.out.println(binarySearch(ar,0,9,7));
    }
    public static int binarySearch(int[] ar, int left, int right, int value){
        int mid=(left+right)/2;

        // base case 1 = checks if array is empty or not
        if ( right - left < 0) {
            return -1;
        }
        // base case 2 = checks if array middle is the target value
        if ( value == ar[mid] ) {
            return mid;
        }
        // recursive case 1 = removes left array
        else if ( value >= ar[mid]) {
            return binarySearch(ar, mid+1, right, value);
        }
        // recursive case 2 = removes right array
        else {
            return binarySearch(ar, left, mid-1, value);
        }

    }

}
