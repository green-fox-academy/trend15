import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a number: ");
        int x = scanner.nextInt();
        double avg;
        int sum = 0;
        boolean equal = true;

        for (int i = 1; i <= x; i++) {
            System.out.println("Please give me a number to calculate sum and avg: ");
            int y = scanner.nextInt();
            sum += y;
        }
        System.out.println("The sum of the numbers is: "+sum);
        avg=sum/x;
        System.out.println("The avg of the number is: " +avg);
    }
}
