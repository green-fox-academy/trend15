import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please give me a number: ");
        int number = scanner.nextInt();
        System.out.println("The sum of the numbers is: "+sum(number));
    }
    private static int sum(int input) {
        int methodNumber = input;
        int sum=0;
        for(int i=1;i<=methodNumber;i++){
            sum+=i;
        }
        return sum;
    }
}
