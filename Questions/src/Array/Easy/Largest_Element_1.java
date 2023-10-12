package Array.Easy;

/*
Question 1 - Largest Element in an Array

Logic -
*/

public class Largest_Element_1 {
    public static void main(String[] args) {
        int []arr={1,5,745,34,3,4};

        int largest_ele=largest_ele(arr);
        System.out.println(largest_ele);

    }

    static int largest_ele(int arr[]){
        int largest_ele=Integer.MIN_VALUE;

        for (int i = 0; i <arr.length; i++) {
            if(arr[i]>largest_ele){
                largest_ele=arr[i];
            }
        }

        return largest_ele;
    }

}
