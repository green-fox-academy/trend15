import java.lang.reflect.Array;
import java.util.Arrays;

public class SubInt {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(subInt(1, new int[]{1, 11, 34, 52, 61})));
        //  should print: `[0, 1, 4]`
        System.out.println(Arrays.toString(subInt(9, new int[]{1, 11, 34, 52, 61})));
        //  should print: '[]'
    }

    public static int[] subInt(int n, int[] array1) {
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            if (String.valueOf(array1[i]).contains(String.valueOf(n))) {
                count++;
            }
        }
        int[] index = new int[count];
        int step =0;
        if (count !=0){
            for (int i = 0; i < array1.length; i++) {
                if (String.valueOf(array1[i]).contains(String.valueOf(n))) {
                    index[step] = array1[i];
                    step++;
                }
            }
        }
        return (index);
    }

}

//  Create a function that takes a number and an array of integers as a parameter
//  Returns the indices of the integers in the array of which the first number is a part of
//  Or returns an empty array if the number is not part of any of the integers in the array

//  Example:
//  System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
//  should print: `[0, 1, 4]`
//  System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
//  should print: '[]'