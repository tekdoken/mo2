package bai14;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr={4,5,3};
        insertionSot(arr);
    }
        public static void insertionSot(int[] array){
            int pos, x;
            for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
                x = array[i];
                pos = i;
                while(pos>0&& x < array[pos-1]){
                    array[pos] = array[pos-1]; // đổi chỗ
                    pos--;
                }
                array[pos] = x;
            }
            System.out.println(array);
        }

}
