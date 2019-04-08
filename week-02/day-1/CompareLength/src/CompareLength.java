public class CompareLength {
    public static void main(String[] args) {
        int[] p1 = {1,2,3};
        int[] p2 = {4,5};
        int size1,size2;
        size1 = p1.length;
        size2 = p2.length;
        if(size2>size1){
            System.out.println("The second array has more element");
        }
        else{
            System.out.println("The first array has more element");
        }
    }
}
