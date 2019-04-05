import java.util.Scanner;

public class DrawPyramid {
    public static void main(String agrs[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a number: ");
        int x = scanner.nextInt();

        for(int i=0;i<x;i++) {
            for(int j=0;j<x-i;j++) {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}
