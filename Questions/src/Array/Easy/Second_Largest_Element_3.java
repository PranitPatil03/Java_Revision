package Array.Easy;

/*
Question 1 - Find Second Smallest and Second-Largest Element in an array

Logic -
*/

public class Second_Largest_Element_3 {
    public static void main(String[] args) {
        int []arr={1,5,745,34,3,4};

        int second_largest_ele=second_largest_ele(arr);
        System.out.println(second_largest_ele);

    }

    static int second_largest_ele(int []arr){
        int largest_ele=Integer.MIN_VALUE;
        int second_largest_ele=Integer.MIN_VALUE;

        for (int i = 0; i <arr.length; i++) {
            if(arr[i]>largest_ele){
                largest_ele=arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>second_largest_ele && arr[i]!=largest_ele){
                second_largest_ele=arr[i];
            }
        }

        return second_largest_ele;
    }

}
