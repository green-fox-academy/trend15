import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFile {
    public static void main(String[] args) {
        Path path = Paths.get("copy1.txt");
        Path path2 = Paths.get("empty.txt");
        copyy(path, path2);
    }
    private static void copyy(Path path, Path path2) {
        try {
            Files.copy(path, path2, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Success");
        } catch (IOException e) {
            System.out.println("File does not exist");
        }
    }
}


