import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me the size of the diagonal in the matrix: ");
        int diagonal = scanner.nextInt();
        for (int i=0;i<diagonal;i++){
            for (int j=0;j<diagonal;j++){
                if(i==j) {
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }
}
