import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a number and I find it out for you: ");
        int x = scanner.nextInt();
        boolean quess = true;

        do {
            System.out.println("My quess is: ");
            int y = scanner.nextInt();
            if (x<y) {
                System.out.println("The stored number is higher");
            }

            if (x>y) {
                System.out.println("The stried number is lower");
            }
            if (x == y) {
                quess = false;
                System.out.println("You found the number: " + x);
            }

        } while (quess);
        System.out.println("end of loop");
    }
}
