package recursion_basics;

public class basics {
    public static void main(String[] args) {
//        foo1(6);
//        foo2(6);
        bar(3);
        int res=sumOfN(3);
        System.out.println(res);
    }

    static void foo1(int n){
        if(n>0){
            foo1(n-1);
            System.out.println(n);
        }
    }
    static void foo2(int n){
        if(n>0){
            System.out.println(n);
            foo2(n-1);
        }
    }

    static int sumOfN(int n){
        if(n==1)return 1;
        return sumOfN(n-1)+n;
    }

    static void bar(int n){
        if(n>0){
            System.out.println(n);
            bar(n-1);
            bar(n-1);
        }
    }

}
