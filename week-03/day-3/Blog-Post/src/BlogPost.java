public class BlogPost {

    String authorName;
    String title;
    String text;
    String publicationDate;


    public void Print() {
        System.out.println("'"+title+"' "+"titled by "+authorName+" posted at "+ publicationDate);
        System.out.println(text);
    }
}

