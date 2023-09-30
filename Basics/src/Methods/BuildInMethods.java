package Methods;

public class BuildInMethods {
    public static void main(String[] args) {

        int a = 4;
        int b = 7;

        System.out.println(Math.min(a, b));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.pow(3, 4));
        System.out.println(Math.abs(-3));
        System.out.println(getRandom(10, 20));
        System.out.println(Math.floor(5.9));
        System.out.println(Math.ceil(4.9));
        System.out.println(Math.round(5.8));
    }

    public static int getRandom(int a, int b) {
        return (int) (Math.random()*6) + 1;
    }
}
