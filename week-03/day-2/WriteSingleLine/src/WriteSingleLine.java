import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class WriteSingleLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        checky(x);
        //checky("Milan");
    }

    private static void checky(String z) {
        try {
            Path filePath = Paths.get("my-file.txt");
            List<String> lines = Files.readAllLines(Paths.get(String.valueOf(filePath)));
            lines.add(z);  // we attach the x string to the list
            Files.write(Paths.get("my-file.txt"),lines); // we write it to the file;
            System.out.println("Success");
        } catch (Exception e) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}

// Write a function that is able to manipulate a file
// By writing your name into it as a single line
// The file should be named "my-file.txt"
// In case the program is unable to write the file,
// It should print the following error message: "Unable to write file: my-file.txt"