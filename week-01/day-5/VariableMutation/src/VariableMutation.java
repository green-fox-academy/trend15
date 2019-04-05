public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        a+=10;
        System.out.println(a);

        int b = 100;
        b-=7;// make b smaller by 7
        System.out.println(b);

        int c = 44;
        c*=2;
        System.out.println(c);

        int d = 125;
        d/=5;// please divide by 5 d's value
        System.out.println(d);

        int e = 8;
        e = (int)Math.pow(e,3); // please cube of e's value
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        boolean t = true;
        if (f2<f1){
            System.out.println(t);
        }
        else {
            t = false;
            System.out.println(t);
        }     // tell if f1 is bigger than f2 (print as a boolean)

        int g1 = 350;
        int g2 = 200;
        g2*=2;
        System.out.println("g2 értéke: "+g2);
        boolean t2 = true;
        if (g2>g1){
            System.out.println(t2);
        }
        else {
            t = false;
            System.out.println(t2);
        }                         // tell if the double of g2 is bigger than g1 (print as a boolean)

        int h = 135798745;
        boolean t3 = true;
        if ((h%11)==0){
            System.out.println("135798745 oszthato 11 ?: " + t3);
        }
        else {
            t3 = false;
            System.out.println("135798745 oszthato 11 ?: " + t3);
        }                   // tell if it has 11 as a divisor (print as a boolean)

        int i1 = 10;
        int i2 = 3;
        boolean t4 = true;
        if (i1>(int) Math.pow(i2,2) && (i1<(int)Math.pow(i2,3))){
            System.out.println("i1 is higher than i2 squared and smaller than i2 cubed: " + t4);
        }
        else{
            t4 = false;
            System.out.println("i1 is higher than i2 squared and smaller than i2 cubed: " + t4);
        }   // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)

        int j = 1521;
        boolean t5 = true;
        if ((j%3==0) && (j%5==0)){
            System.out.println("j is dividable by 3 or 5 " + t5);
        }
        else {
            t5= false;
            System.out.println("j is NOT dividable by 3 or 5 " + t5);

        }        // tell if j is dividable by 3 or 5 (print as a boolean)
    }
}