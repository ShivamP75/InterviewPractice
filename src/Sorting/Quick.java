package Sorting;

import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 8, 4, 3, 2};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int l, int r) {
        if (l > r) return;
        int pivIndx = partition(arr, l, r);
        quickSort(arr, l, pivIndx - 1);
        quickSort(arr, pivIndx + 1, r);
    }

    public static int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int i = l;
        int j = l;
        while (i <= r) {
            if (arr[i] <= pivot) {
                if (i != j) swap(arr, i, j);
                j++;
            }
            i++;
        }
        return j - 1;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
