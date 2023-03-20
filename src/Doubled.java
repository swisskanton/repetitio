import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
    // Create a method called `decryptDoubled` that takes a filename string
    // as a parameter and decrypts the file's content.
    // Decryption is the process reversing an encryption, i.e. the process
    // which converts encrypted data into its original form.
    // If the file can't be opened it should print this message: "File not found"
    // The (decrypted) result should be saved in the "output.txt" file (don't change the path).

    public static void main(String[] args) {
        decryptDoubled("src/resources/duplicated-chars.txt");
    }

    public static void decryptDoubled(String file) {
        List<String> content = new ArrayList<>();
        content = readFile(file);
        content = decryption(content);
        String newFile = writeFile(file, "output.txt", content);
        printFile(newFile);
    }

    public static List<String> readFile(String file) {
        Path filePath = Paths.get(file);
        List<String> content = new ArrayList<>();
        try {
            content = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.err.println("File not found");
            System.exit(1);
        }
        return content;
    }

    public static List<String> decryption(List<String> content) {
        List<String> result = new ArrayList<>();
        for (String line: content) {
            String newLine = "";
            for (int i = 0; i < line.length(); i += 2) {
                newLine += line.charAt(i);
            }
            result.add(newLine);
        }
        return result;
    }

    public static String writeFile(String path, String fileName, List<String> content) {
        String newFile = path.substring(0, path.lastIndexOf("/") + 1) + fileName;
        Path newPath = Paths.get(newFile);
        try {
            Files.write(newPath, content);
        } catch (IOException e) {
            System.err.printf("Unable to write file: %s", newFile);
            System.exit(2);
        }
        return newFile;
    }

    public static void printFile(String file) {
        List<String> content = new ArrayList<>();
        content = readFile(file);
        for (String line: content) {
            System.out.println(line);
        }
    }
}