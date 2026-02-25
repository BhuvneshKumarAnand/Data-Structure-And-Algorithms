package SortingPrep;

import java.util.Arrays;

public class SortingPrep {

    /* Bubble Sort */
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 1, 2, 5};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
