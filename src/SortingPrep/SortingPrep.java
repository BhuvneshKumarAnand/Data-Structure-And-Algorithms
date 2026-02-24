package SortingPrep;

import java.util.Arrays;

public class SortingPrep {

    /* Bubble Sort */
    public static int[] bubbleSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4,6,1,2,5};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
