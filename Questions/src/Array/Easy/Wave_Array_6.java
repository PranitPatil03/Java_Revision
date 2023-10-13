package Array.Easy;

import java.util.Arrays;

public class Wave_Array_6 {
    public static void main(String[] args) {
        int []arr={6,1,2,9,4,7};
//        waveArray(arr);
//        printArray(arr);

        waveArrayLex(arr);
        printArray(arr);
    }
    static void printArray(int []arr){
        for (int e:arr) {
            System.out.print(e+" ");
        }
    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void waveArray(int []arr){
        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i+=2) {
            swap(arr,i,i-1);
        }
    }

    static void waveArrayLex(int []arr){
        for (int i = 1; i < arr.length; i+=2) {
            if(arr[i]>arr[i-1]){
                swap(arr,i,i-1);
            }
            if(i<arr.length-1 && arr[i]>arr[i+1]){
                swap(arr,i,i+1);
            }
        }
    }

}
