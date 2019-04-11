public class SumDigits {
    public static void main(String[] args) {
        int x=2;
        System.out.println(sum(x));
    }

    private static int sum(int x) {
        if(x == 0){
            return 0;
        }
        int rigthDigit = x % 10; //
        return sum(x / 10) + rigthDigit;

    }
}

//Given a non-negative int n, return the sum of its digits recursively (no loops).

// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
// while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).