package Array.Easy;

/*
Question 1 - Find Second Smallest and Second-Largest Element in an array

Logic -
*/

public class Second_Smallest_Element_4 {
    public static void main(String[] args) {
        int []arr={1,5,745,34,3,4};

        int second_largest_ele= second_smallest_ele(arr);
        System.out.println(second_largest_ele);

    }

    static int second_smallest_ele(int []arr){
        int smallest_ele=Integer.MAX_VALUE;
        int second_smallest_ele=Integer.MAX_VALUE;

        for (int i = 0; i <arr.length; i++) {
            if(arr[i]<smallest_ele){
                smallest_ele=arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]<second_smallest_ele && arr[i]!=smallest_ele){
                second_smallest_ele=arr[i];
            }
        }

        return second_smallest_ele;
    }

}
