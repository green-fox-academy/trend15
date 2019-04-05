import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a number: ");
        int x = scanner.nextInt();
        System.out.println("Please give me a number: ");
        int y = scanner.nextInt();

        if (y<x) {
            System.out.println("The second number should be bigger");
        }
        else{
            for(int i=x;i<y;i++){
                System.out.println(i);
            }
        }

    }
}
