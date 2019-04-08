import java.util.Scanner;
public class Doubling {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Please give a number and I double it: ");
                int baseNum = scanner.nextInt();
                int c = doubling(baseNum);
                System.out.println("The doubled value is = " + c);
                }
                public static int doubling(int n1) {
                    n1*=2;
                return n1;
        }
}

// - Create an integer variable named `baseNum` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(baseNum)`