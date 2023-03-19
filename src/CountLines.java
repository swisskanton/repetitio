// Write a function called countLines() that takes a filename as string as a parameter
// and returns the number of lines the file contains.
// It should return zero if it can't open the file
// and should not raise any error.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        System.out.println(countLines("src/my-file.txt"));
    }

    public static int countLines(String source) {
        Path filePath = Paths.get(source);
        int result = 0;
        try {
            List<String> lines = Files.readAllLines(filePath);
            result = lines.size();
        } catch (IOException e) {
            result = 0;
        }
        return result;
    }
}
