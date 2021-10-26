package bai14.th3;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            /* Find the minimum in the list[i..list.length-1] */
            double min = list[i];   //1
            int indexMin = i;   //0

            for (int j = i + 1; j < list.length; j++) {
                if (min > list[j]) {  //9
                    min = list[j];
                    indexMin = j;
                }
            }

            /* Swap list[i] with list[indexMin] if necessary */
            if (indexMin != i) {
                list[indexMin] = list[i];
                list[i] = min;
            }
        }
    }

    public static void selectionSortCach2(double[] array) {
        int min; // chỉ số phần tử nhỏ nhất trong dãy hiện hành
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[min])
                    min = j; // ghi nhận vị trí phần tử nhỏ nhất
            if (min != i) {
                double temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.println(list[i] + ", ");
        System.out.println("---------------");
//        selectionSortCach2(list);
        for (double x:list
             ) {
            System.out.println(x);
        }
    }
}

