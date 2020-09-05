import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(final int a, final int b, final int c) {
        int max = Math.max(a,b);
        max = Math.max(max,c);
        int min = Math.min(a,b);
        min = Math.min(min,c);
        return a+b+c-max-min;
    }

    // Returns the input with the larger absolute value
    public static int magnitude(final int a, final int b) {
        if (Math.abs(a)>Math.abs(b)){
            return a;
        }else{
            return b;
        } // REPLACE WITH YOUR CODE
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(final int a, final int b) {
        double a2 = a;
        double b2 = b;

        return Math.sqrt(a2*a2+b2*b2); // REPLACE WITH YOUR CODE
    }

    public static void main(final String[] args) {
        // You may want to keep these lines of code to test that your methods work

        final Scanner scan = new Scanner(System.in);
        System.out.println("What command would you like to carry out?");
        String command = scan.nextLine();
        if (command.equals("median")){
            System.out.println("What is the first number?");
            int a = scan.nextInt();
            System.out.println("What is the second number?");
            int b = scan.nextInt();
            System.out.println("What is the third number?");
            int c = scan.nextInt();
            int result = median(a,b,c);
            System.out.println("The median is " + result);
        }else if (command.equals("magnitude")){
            System.out.println("What is the first number?");
            int a = scan.nextInt();
            System.out.println("What is the second number?");
            int b = scan.nextInt();
            int result = magnitude(a,b);
            System.out.println("The magnitude is " + result);
        }else if (command.equals("pythagoras")){
            System.out.println("What is the first number?");
            int a = scan.nextInt();
            System.out.println("What is the second number?");
            int b = scan.nextInt();
            double result = pythagoras(a,b);
            System.out.println("c = " + result);
        }else{
            System.out.println("sorry you must have mispelled it. try again.");
        }
    }
}
