package ArrayRotationQ;

import java.util.Arrays;

public class RotateSortedArrayKtimes {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 8};
        int k = 2;
        rotate(arr,arr.length, k);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] arr , int n,int k){
        k = k % n;
        if(k < 0) k = k + n;

        swapArray(arr,0,n-k-1);
        swapArray(arr,n-k, n-1);
        swapArray(arr,0, n-1);
    }
    public static void swapArray(int[] arr, int l , int r){
        while(l <= r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
