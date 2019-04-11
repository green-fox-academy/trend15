public class Power {
    public static void main(String[] args) {
        int y=2;
        int x=5;
        System.out.println(powy(x,y));
    }

    private static int powy(int x, int y) {
        if (x == 0 || y == 0){
            return 1;
        }
        return powy(x-1,y)*y;
    }

}
