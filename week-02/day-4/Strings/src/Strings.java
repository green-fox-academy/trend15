public class Strings {
    public static void main(String[] args) {
        String s = "The string what I have to change around with extra xavier";
        char from = 'x';
        char to = 'y';

        System.out.println(changert(s,from,to));
    }

    private static String changert(String s, char from, char to) {
        if (s.length() < 1) {
            return s;
        }
        else {
            char first = from == s.charAt(0) ? to : s.charAt(0);
            return first + changert(s.substring(1), from, to);
        }
    }
}
