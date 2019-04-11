public class Bunnies {
    public static void main(String[] args) {
        int bunnynumber = 14;
        System.out.println("Number of ears of Bunnies: "+bunnysumear(bunnynumber));
    }

    private static int bunnysumear(int bunnynumber) {
        if (bunnynumber == 0){
            return 0;
        }
        return bunnysumear(bunnynumber-1)+2;
    }
}
