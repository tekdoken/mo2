package bai14.isertionSortRun;

import java.util.Scanner;

public class InsertionSortRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        insertionSort(list);

        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
    }

    public static void insertionSort(int[] list) {
        boolean needNextPass = true;
        int pos, x;
        for (int i = 1; i < list.length&&needNextPass; i++) { //đoạn array[0] đã sắp xếp
           needNextPass = false;
            x = list[i];
            pos = i;
            while (pos > 0 && x < list[pos - 1]) {
                list[pos] = list[pos - 1]; // đổi chỗ
                pos--;
                needNextPass=true;
            }
            list[pos] = x;
            if (needNextPass == false) {
                System.out.println("Mảng có thể được sắp xếp và không cần chuyển tiếp theo");
                break;
            }
            /* Show the list after sort */
            System.out.print("List after the sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
}
