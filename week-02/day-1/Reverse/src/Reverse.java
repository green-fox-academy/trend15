
public class Reverse {
    public static void main(String[] args) {
        int[] aj = {3, 4, 5, 6, 7};
        aj = (revers(aj, aj.length));
        prin(aj,aj.length);
    }
    private static void prin(int[] aj, int length) {
        for(int i = 0;i<aj.length;i++){
            System.out.print(" "+aj[i]);
        }
    }
    private static int[] revers(int[] a, int n) {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        return b;
    }
}
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`