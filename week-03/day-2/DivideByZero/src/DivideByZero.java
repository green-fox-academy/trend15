import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please give me a number: ");
        double x = input.nextInt();
        checky12(x);
    }

    private static void checky12(double x) {
        try {
            double y =  10 / x;
            System.out.println("The devided number is: "+y);
        } catch (Exception e) {
            System.out.println("Fail");
        }
    }
}
// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0
