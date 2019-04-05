public class Swap {
    public static void main(String[] args) {
        int a = 123;
        int b = 526;
        int changer;

        changer = a;
        a = b;
        b = changer;

        System.out.println("A 123 " + a);
        System.out.println("B 526 " + b);
    }

}
