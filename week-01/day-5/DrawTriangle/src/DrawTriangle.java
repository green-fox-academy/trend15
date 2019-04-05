import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please give me a number and I draw a triangle: ");
        int x = scanner.nextInt();

        for (int i =1;i<=x;i++){

            for (int j =1;j<=x;j++){

                if(j<=i)
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
