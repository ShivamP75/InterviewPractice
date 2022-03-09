package Sorting;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] arr = {5,6,1,8,4,3,2};
        int[] arr1 = mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr1));
    }

    public static int[] mergeSort(int[] arr, int l , int r){
        if(l >= r) {
            int[] a = new int[1];
            a[0] = arr[l];
            return a;
        }
        int mid = (l + r ) / 2;
        int[] lArray = mergeSort(arr, l , mid);
        int[] rArray = mergeSort(arr, mid+1, r);
        return mergeTwoSortedArray(lArray, rArray);
    }

    public static int[] mergeTwoSortedArray(int[] lArray, int[] rArray){
        int[] arr = new int[lArray.length + rArray.length];
        int j = 0;
        int k = 0;
        for (int i = 0; i <(lArray.length + rArray.length)  ; i++) {
            if(j != lArray.length && k != rArray.length){
                arr[i] = (lArray[j] > rArray[k]) ? rArray[k++] : lArray[j++];
            }
            else if(j < lArray.length) arr[i] = lArray[j++];
            else arr[i] = rArray[k++];
        }
        return arr;
    }
}
