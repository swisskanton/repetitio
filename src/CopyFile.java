import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    // Write a `copy` function that copies the contents of a file into another file.
    // The function should take two filenames (strings) as parameters:
    //  - path and name of the source file
    //  - path and name of the target file
    // It should return a boolean that shows whether the copy was successful or not.

    public static void main(String[] args) {
        String source = "src/my-file.txt";
        String target = "src/my-target.txt";
        if (copy(source, target))
            System.out.println("The copy was successful.");
        else
            System.out.println("Copy failed.");
    }

    public static boolean copy(String source, String target) {

        Path sourcePath = Paths.get(source);
        Path targetPath = Paths.get(target);
        List<String> content = new ArrayList<>();
        try {
            content = Files.readAllLines(sourcePath);
        } catch (IOException e) {
            System.err.printf("Unable to read file: %s\n", source);
            return false;
        }
        try {
            Files.write(targetPath, content);
        } catch (IOException e) {
            System.err.printf("Unable to write file: %s\n", target);
            return false;
        }
        return true;
    }
}