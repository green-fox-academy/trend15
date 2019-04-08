import java.util.Arrays;

public class SubInt2 {
    public static void main(String[] args) {

        System.out.println(subInt(1, new int[]{1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        System.out.println(subInt(9, new int[]{1, 11, 34, 52, 61}));
        //  should print: '[]'
    }

    public static String subInt(int n, int[] array1) {
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
        return Arrays.toString(index);
    }


}