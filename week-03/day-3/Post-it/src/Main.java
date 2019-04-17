public class Main {
    public static void main(String[] args) {
        PostIt x = new PostIt();
        x.backgroundColor = "orange";
        x.textColor="blue";
        x.text="Idea 1";
        x.Print();

        PostIt y = new PostIt();
        y.backgroundColor = "pink";
        y.textColor="black";
        y.text="Awesome";
        y.Print();

        PostIt c = new PostIt();
        c.backgroundColor = "yellow";
        c.textColor="green";
        c.text="Superb!";
        c.Print();
    }
}
