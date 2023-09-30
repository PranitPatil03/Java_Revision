package Questions;

public class E_MinNumber {
    public static void main(String[] args) {

        int []numbers1 = {23, 12, 6, 7, 15, 3, 2, 56,1};

        int min = Integer.MAX_VALUE;

        for (int number : numbers1) {
            if(number < min) {
                min = number;
            }
        }

        System.out.println("minimum is "+min);
    }
}
