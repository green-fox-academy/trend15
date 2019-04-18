public class Main {
    public static void main(String[] args) {
        Sharpie blue = new Sharpie("blue",100);
        Sharpie red = new Sharpie("red",100);
        Sharpie green = new Sharpie("green",100);
        SharpieSet sh = new SharpieSet();
        sh.add(blue);
        sh.add(red);
        sh.add(green);
        System.out.println(sh.countUsable());
        for (int i=0;i<=99;i++){
            red.use();
        }
        red.Print();
        sh.removeTrash();
        System.out.println(sh.countUsable());
    }
}
