public class Reverse {
    public static void main(String[] args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        int size = reversed.length();
        String reservedBack = reverse(reversed);
        boolean y = check(reversed, reservedBack, size);
        System.out.println("Is our program works OK?: " + y);
    }

    private static String reverse(String reversed) {
        char[] in = reversed.toCharArray();
        int begin = 0;
        int end = in.length - 1;
        char temp;
        while (end > begin) {
            temp = in[begin];
            in[begin] = in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }

    private static boolean check(String reversed, String reservedBack, int size) {
        boolean check = true;
        for (int i = 0; i < size; i++) {
            if (reversed.charAt(i) == reservedBack.charAt(size-1-i)) {
                check = true;
            } else {
                check = false;
                break;
            }
        }
        return check;
    }

}
// Create a method that can reverse a String, which is passed as the parameter
// Use it on this reversed string to check it!
// Try to solve this using charAt() first, and optionally anything else after.
