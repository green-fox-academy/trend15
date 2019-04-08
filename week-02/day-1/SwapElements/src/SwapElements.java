public class SwapElements {
    public static void main(String[] args) {
        String[] abc = {"first", "second", "third"};
        for (int i = 0;i<abc.length;i++){
            System.out.print(abc[i]+" ");
        }
        String[] change = new String[1];
        change[0]=abc[0];
        abc[0]= abc[2];
        abc[2]=change[0];
        System.out.println();
        for (int i = 0;i<abc.length;i++){
            System.out.print(abc[i]+" ");
        }
    }
}
// - Swap the first and the third element of `abc`