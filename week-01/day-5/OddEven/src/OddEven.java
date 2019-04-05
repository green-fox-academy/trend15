import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please give me a number and I decide it is an Odd number or an Even number: ");
        int x = scanner.nextInt();
        if((x%2)==0){
            System.out.println("The number is an Even number");
        }
        else System.out.println("The number is a Odd number");
    }
}
