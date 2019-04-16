import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        try { // Required by Files.readAllLines(filePath);
            // Reads the content from `lorem-psum.txt` in the `assets` folder line by line to a String List
            Path filePath = Paths.get("my-file.txt");
            List<String> lines = Files.readAllLines(Paths.get(String.valueOf(filePath)));
                System.out.println(lines);
        } catch (Exception e) {
            System.out.println("Unable to read file: my-file.txt");
        }
    }
}