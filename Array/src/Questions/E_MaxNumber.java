package Questions;

public class E_MaxNumber {
    public static void main(String[] args) {

        int []numbers1 = {23, 12, 6, 7, 15, 3, 2, 56,1};

        int max = Integer.MIN_VALUE;

        for (int number : numbers1) {
            if(number > max) {
                max= number;
            }
        }

        System.out.println("minimum is "+max);
    }
}
