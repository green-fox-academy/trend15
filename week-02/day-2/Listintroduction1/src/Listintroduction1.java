import java.util.ArrayList;

public class Listintroduction1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        System.out.println(names.size());
        {
            names.add("William");
            if (names.size() == 0) {
                System.out.println("The Array List is empty!");
            } else {
                System.out.println("The Array List in Not empty!");
            }
            names.add("John");
            names.add("Amanda");
            System.out.println(names.size());
            System.out.println(names.get(2));
            System.out.println();
            for (String s : names) {
                System.out.println(s);
            }
            System.out.println();
            for (int i=0;i<names.size();i++){
                System.out.println((i+1) +". "+names.get(i));
            }
            System.out.println();
            names.remove(1);
            for (int j= names.size()-1;j>=0;j--){
                System.out.println(names.get(j));
            }
            names.clear();
        }
    }
}
