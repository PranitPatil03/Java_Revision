package Array.Easy;

import java.util.Arrays;

public class RotateArrayLeft_5 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
//        rotateByK(arr,3);
//        printArray(arr);

        int []k={4,3};
        int [][]ans=multipleRotations(arr,k);
        print2Array(ans);
    }
    
    static void printArray(int []arr){
        for (int e:arr) {
            System.out.print(e+" ");
        }
    }
    static void print2Array(int [][]arr){
        for (int []e:arr) {
            System.out.print(Arrays.toString(e) +" ");
            System.out.println();
        }
    }

    static void rotateByK(int []arr,int n){

        for(int i=0;i<n;i++){
            int temp=arr[0];

            for (int j = 0; j < arr.length-1; j++) {
                arr[j]=arr[j+1];
            }

            arr[arr.length-1]=temp;

        }
    }

    static int[][] multipleRotations(int []arr,int []k){
        int n=arr.length;
        int m=k.length;

        int [][]ans=new int[m][n];
        int []temp=new int[2*n];

        for (int i = 0; i < n; i++) {
            temp[i]=arr[i];
            temp[i+n]=arr[i];
        }

        for (int i = 0; i <m; i++) {
            int offset=k[i]%n;
            for (int j = 0; j < n; j++) {
                ans[i][j]=temp[j+offset];
            }
        }
        return ans;
    }

}
