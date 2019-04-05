import java.util.Scanner;

public class FavoriteNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please give me your favourite number: ");
        int num = scan.nextInt();

        System.out.println("My favourite number is: " + num);
    }
}
