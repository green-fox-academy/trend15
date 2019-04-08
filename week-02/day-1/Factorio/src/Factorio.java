import java.util.Scanner;

public class Factorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please give me a number: ");
        int number = scanner.nextInt();
        System.out.println("The factorial of the numbers is: "+factorio(number));
    }
    private static int factorio(int input) {
        int methodNumber = input;
        int factor=1;
        for(int i=1;i<=methodNumber;i++){
            factor*=i;
        }
        return factor;
    }
}
