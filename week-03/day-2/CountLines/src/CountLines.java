import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {

        checky("my-file.txt");
    }

    private static void checky(String x) {
        try {
            Path filePath = Paths.get(x);
            List<String> lines = Files.readAllLines(Paths.get(String.valueOf(filePath)));
            System.out.println(lines.size());
        } catch (Exception e) {
            System.out.println("0");
        }
    }
}


// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.