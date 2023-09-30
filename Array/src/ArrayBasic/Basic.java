package ArrayBasic;

public class Basic {
    public static void main(String[] args) {

        int []age1;
        age1 = new int[5];

        int []age2 = new int[5];

        age1[0] = 5;
        age1[1] = 2;

        System.out.println(age1[0]);
        System.out.println(age1[1]);
        System.out.println(age1[2]);

        System.out.println(age1.length);

        int []marks = {98, 12, 45, 12, 65};

        System.out.println(marks[4]);

        String []names = {"Ram", "Harish", "Karan", "Monty"};

        for(int i = 0; i < names.length; i++) {
            System.out.println("Name is "+names[i]);
        }

        for(String name: names) {
            System.out.println("for each "+name);
        }
    }
}
