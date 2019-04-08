public class PrintAll {
    public static void main(String[] args) {
        int[] number = {4, 5, 6, 7};
        int size = number.length;
        for (int i = 0;i<size;i++){
            System.out.println(i + " the elememt is " + number[i]);
        }
    }
}
// - Create an array variable named `numbers`
//   with the following content: `[4, 5, 6, 7]`
// - Print all the elements of `numbers`