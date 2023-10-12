package Array.Easy;

/*
Question 1 - Smallest Element in an Array

Logic -
*/

public class Smallest_Element_2 {
    public static void main(String[] args) {
        int []arr={1,5,745,34,3,4};

        int smallest_ele=smallest_ele(arr);
        System.out.println(smallest_ele);

    }

    static int smallest_ele(int arr[]){
        int smallest_ele=Integer.MAX_VALUE;

        for (int i = 0; i <arr.length; i++) {
            if(arr[i]<smallest_ele){
                smallest_ele=arr[i];
            }
        }

        return smallest_ele;
    }

}
