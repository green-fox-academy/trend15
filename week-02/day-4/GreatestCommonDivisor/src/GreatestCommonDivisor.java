public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int x =10;
        int y = 5;
        System.out.println("The number: "+x+" and the "+y+" greatest divisor is: "+divisor(x,y));
    }

    private static int divisor(int x, int y) {
        if (y != 0){
            return divisor(y,x%y);
        }
        else {
            return x;
        }
    }
}
