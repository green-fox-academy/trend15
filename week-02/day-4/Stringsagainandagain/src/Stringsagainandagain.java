public class Stringsagainandagain {
    public static void main(String[] args) {
        String words = "hello world, i am a java program, how are you today?";
        char from = ' ';
        char to = '*';
        System.out.println(replace(words, from, to));
    }
    public static String replace(String s, char from, char to){
        if (s.length() < 1)
            return s;
        if (s.charAt(0) == from) {
            s = to + s.substring(1);
        }
        return s.charAt(0) + replace(s.substring(1, s.length()), from, to);
    }
}
