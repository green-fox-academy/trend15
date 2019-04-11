public class Bunniesagain {
    public static void main(String[] args) {
        int bunnies =6;
        System.out.println(buniessumear(bunnies));
    }
    public static int buniessumear(int x){
        int sum=0;
        if(x == 0){
            return 0;
        }
        if (x % 2 ==1){
            sum+=3;
        }
        if (x%2==0){
            sum+=2;
        }
        return (buniessumear(x-1)+sum);
    }
}
