package Methods;

public class MethodBasics {
    public static void main(String[] args) {

        int averageFromFunction = average(4, 6, false);
        int doubleOfAvg = averageFromFunction * 2;
        System.out.println("hello");
        System.out.println(doubleOfAvg);
    }

    static void greet() {
        System.out.println(5);
        System.out.println("Hello World");
        System.out.println(6);
    }

    public static int average(int a, int b, boolean shouldAverage) {
        if(shouldAverage) {
            return -1;
        }
        int avg = (a+b)/2;
        System.out.println("returning the avg");
        return avg;
    }

    static int minimum(int a, int b) {
        return Math.min(a, b);
    }

}
