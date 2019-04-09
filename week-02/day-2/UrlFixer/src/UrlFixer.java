public class UrlFixer {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";
        url = url.replace("bots", "odds");
        String separatedurl = url.substring(5);
        url = "https:" + separatedurl;
        System.out.println(url);
    }
}
