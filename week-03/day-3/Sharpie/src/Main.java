public class Main {
    public static void main(String[] args) {
        Sharpie sharpie = new Sharpie();
        sharpie.color = "Green";
        sharpie.width=50;
        sharpie.use();
        sharpie.Print();

        Sharpie sharpie1 = new Sharpie("Blue",40);
        sharpie1.use();
        sharpie1.use();
        sharpie1.use();
        sharpie1.use();
        sharpie1.use();
        sharpie1.use();
        sharpie1.Print();

    }
}
