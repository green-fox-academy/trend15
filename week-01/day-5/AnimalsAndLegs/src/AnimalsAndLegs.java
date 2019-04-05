import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me the number of Chickens: ");
        int chikens = scanner.nextInt();

        System.out.println("Please give me the number of Piggies: ");
        int pigs = scanner.nextInt();

        int All = ((chikens*2) + (pigs*4));

        System.out.println("All the chiken and pig legs in the farm together is: " + All);
    }
}
