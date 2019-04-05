import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {

        int avg;
        int sum=0;

        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.print("Please give me " + (5-i) + " number: ");
            int x = scanner.nextInt();
            sum+= x;

        }
        avg=sum/5;
        System.out.println("Sum: " + sum + ", Average: " + avg);
    }

}
