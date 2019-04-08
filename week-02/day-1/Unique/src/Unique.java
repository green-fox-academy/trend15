import java.util.Arrays;
import java.util.stream.IntStream;

public class Unique {
    public static void main(String[] args) {
        
        
        System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        
        //  should print: `[1, 11, 34, 52, 61]`
    }

    private static String unique(int[] ints) {
        int[] noDuplicates = IntStream.of(ints).distinct().toArray();
        return Arrays.toString(noDuplicates);
    }
}