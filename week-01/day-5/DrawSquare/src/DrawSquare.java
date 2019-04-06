import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please give a number:");
        int input = scanner.nextInt();

        for (int level = 0; level < input; level++) {
            if (level == 0 || level == input -1) {
                for (int lev = 0; lev < input; lev++) {
                    System.out.print("%");
                }
                System.out.println();

            } else {
                System.out.print("%");
                for (int lev = 1; lev < input -1; lev++) {
                    System.out.print(" ");
                }
                System.out.print("%");
                System.out.print("\n");
            }
        }


    }


}