package recursion_questions.Easy;

public class fiboancci {
    public static void main(String[] args) {
        int res=fibo(8);
        System.out.println(res);
    }

    static int fibo(int n){

        if(n<=1) return n;

        return fibo(n-1)+fibo(n-2);
    }
}
