import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        // Write a program that opens a file called "my-file.txt" and prints each
        // line from the file to separate lines on the console.
        // If the program is unable to read the file (for example the file does not exist),
        // it should print the following error message: "Unable to read file: my-file.txt".

        printFile("resources/my-file.txt");
        System.out.println();
        printFile("src/resources/my-file.txt");
    }

    public static void printFile(String source) {
        Path filePath = Paths.get(source);
        try {
            List<String> lines = Files.readAllLines(filePath);
            for (String line: lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.printf("Unable to read file: %s\n", source);
        }
    }
}