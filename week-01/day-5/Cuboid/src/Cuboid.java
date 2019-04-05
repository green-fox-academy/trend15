import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {

        System.out.println("Please give me the cuboid a parameter: ");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();

        System.out.println("Please give me the cuboid b parameter: ");
        double b = scan.nextDouble();

        System.out.println("Please give me the cuboid c parameter: ");
        double c = scan.nextDouble();

        double surface = ((2*(a*b))+(2*(a*c))+(2*(b*c)));
        double volume = a*b*c;

        System.out.println("Surface: " + (int)Math.round(surface));
        System.out.println("volume: " + (int)Math.round(volume));


    }
}
