public class Numberadder {
    public static void main(String[] args) {
        System.out.println(num(5));
    }

    public static int num(int n) {
        if (n == 0) {
            return 0;
        }
        return num(n - 1)+n;

    }
}
