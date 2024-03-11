import java.util.Scanner;

public class Main {
    static void first_task() {
        Integer a;
        Integer b;

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter number a");
        a = Integer.parseInt(myObj.nextLine());

        System.out.println("Enter number b");
        b = Integer.parseInt(myObj.nextLine());

        System.out.println("a is: " + a);
        System.out.println("b is: " + b);

        if (a > b) {
            System.out.println(a + " > " + b + " (a > b)");
        }

        if (a < b) {
            System.out.println(a + " < " + b + " (a < b)");
        }

        if (a == b) {
            System.out.println(a + " = " + b + " (a = b)");
        }

        System.out.println("Sum " + (a + b));
        System.out.println("Sub " + (a - b));
        System.out.println("Multi " + (a * b));
        System.out.println("Div " + (a / b));
    }

    static void second_task() {
        String a;
        String b;

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter string a");
        a = myObj.nextLine();

        System.out.println("Enter string b");
        b = myObj.nextLine();

        System.out.println("String a is: " + a);
        System.out.println("String b is: " + b);

        if (a.equals(b)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }

    static void third_task() {
        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0) {
                System.out.println(intArray[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the task number");
        System.out.println("1 - two numbers");
        System.out.println("2 - string comparison");
        System.out.println("3 - odd array");

        Integer task = Integer.parseInt(myObj.nextLine());

        if (task == 1) {
            first_task();
        }

        if (task == 2) {
            second_task();
        }

        if (task == 3) {
            third_task();
        }
    }
}