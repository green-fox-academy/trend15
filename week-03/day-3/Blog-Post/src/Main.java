public class Main {
    public static void main(String[] args) {
        BlogPost x = new BlogPost();
        x.title = "Lorem Ipsum";
        x.authorName = "John Doe";
        x.publicationDate = "2000.05.04";
        x.text = "Lorem ipsum dolor sit amet.";
        x.Print();

        BlogPost y = new BlogPost();
        y.title = "Wait but why";
        y.authorName = "Tim Urban";
        y.publicationDate = "2010.10.10.";
        y.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        y.Print();

        BlogPost c = new BlogPost();
        c.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        c.authorName = "William Turton";
        c.publicationDate = "2017.03.28.";
        c.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
        c.Print();
    }
}
