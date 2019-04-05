import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please give me a number: ");
        int x = scanner.nextInt();

        System.out.print("Please give me the second number and I decide which is bigger: ");
        int y = scanner.nextInt();

        if(x>y) {
            System.out.print("The first number is bigger than the second one");
        }
        else {
            System.out.print("The second number is bigger than the first one");
        }
        // Write a program that asks for two numbers and prints the bigger one

    }
}
