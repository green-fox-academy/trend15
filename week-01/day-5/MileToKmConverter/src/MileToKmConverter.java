import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me the distance in KM and I will provide it in Miles: ");
        int km = scanner.nextInt();

        double Miles = km*0.62137;
        System.out.println(Miles);

        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
    }
}
