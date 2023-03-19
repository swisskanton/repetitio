import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Write a program in the `main` method that is able to manipulate a file
        // by writing your name into it as a single line.
        // The file should be named "my-file.txt".
        // In case the program is unable to write the file,
        // it should print the following error message: "Unable to write file: my-file.txt".

        List<String> line = new ArrayList<>();
        line.add("My name is Swisskanton.");
        Path filePath = Paths.get("src/my-file.txt");
        try {
            Files.write(filePath, line, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}