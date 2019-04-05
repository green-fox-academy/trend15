import java.util.Scanner;

public class SubStr {

        public static int subStr (String x, String y) {
            String input = x;
            String q = y;
            int pos = input.indexOf(q);
            if (pos >= 1) {
                return pos;
            } else return -1;
        }

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a string:");
        String string = scanner.nextLine();
        System.out.println("Give me a substring:");
        String substring = scanner.nextLine();

        System.out.println(subStr(string, substring));


    }

}


