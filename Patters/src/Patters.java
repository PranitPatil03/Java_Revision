public class Patters {
    public static void main(String[] args) {
        pattern1();
        pattern2();
        pattern3();
        pattern4();
        pattern5();
        pattern6();
        pattern7();
        pattern8();
        pattern9();
        pattern10();
        pattern11();

    }
    static void pattern1(){
        for (int i=1;i<7;i++){
            for (int j=1;j<7;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    static void pattern2(){
        for (int i=1;i<6;i++){
            for (int j=1;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    static void pattern3(){
        for (int i=1;i<7;i++){
            for (int j=1;j<i+1;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }

    static void pattern4(){
        for (int i=1;i<7;i++){
            for (int j=1;j<7-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<i+1;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    static void pattern5(){
        for (int i=1;i<7;i++){
            for (int j=1;j<7-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<i+1;k++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }

    static void pattern6(){
        int n=5;
        for (int i=0;i<n;i++){
            for (int j=1;j<n-i;j++){
                System.out.print(" ");
            }

            System.out.print("*");

            for (int k=0;k<=2*i-1;k++){
                if(k==2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

        for (int i=n-2;i>=0;i--){
            for (int j=1;j<5-i;j++){
                System.out.print(" ");
            }

            System.out.print("*");

            for (int k=0;k<=2*i-1;k++){
                if(k==2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

    static void pattern7(){
        int n=7;
        for (int i=1;i<n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    static void pattern8(){
        int n=7;
        for (int i=1;i<n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
    static void pattern9(){
        int n=7;
        for (int i=1;i<n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }

    static void pattern10(){
        int n=7;
        for (int i=1;i<n;i++){
            for (int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    static void pattern11(){
        int n=5;
        for (int i=0;i<n;i++){
            for (int j=1;j<n-i;j++){
                System.out.print(" ");
            }

            System.out.print("*");

            for (int k=0;k<=2*i-1;k++){
                if(k==2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }

        for (int i=n-2;i>=0;i--){
            for (int j=1;j<5-i;j++){
                System.out.print(" ");
            }

            System.out.print("*");

            for (int k=0;k<=2*i-1;k++){
                if(k==2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }

}






























