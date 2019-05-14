import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class main {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
    OptionalDouble avarage = numbers.stream().mapToDouble(a -> a).filter(x -> x % 2 == 1).average();
    System.out.println(avarage);
  }
}

