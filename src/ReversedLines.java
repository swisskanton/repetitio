// Create a method called `decryptReversed` that takes a filename string
// as a parameter and decrypts the file's content.
// Decryption is the process reversing an encryption, i.e. the process
// which converts encrypted data into its original form.
// If the file can't be opened it should print this message: "File not found"
// The (decrypted) result should be saved in the "output.txt" file (don't change the path).

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {
        decryptReversed("src/resources/reversed-lines.txt");
    }

    public static void decryptReversed(String file) {
        List<String> content = new ArrayList<>();
        content = readFile(file);
        content = decrypting(content);
        String newFile = writeFile(file, content);
        printFile(newFile);
    }

    public static List<String> readFile(String file) {
        List<String> content = new ArrayList<>();
        Path filePath = Paths.get(file);
        try {
            content = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.err.println("File not found.");
            System.exit(1);
        }
        return content;
    }

    public static List<String> decrypting(List<String> content) {
        List<String> newContent = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (String line: content) {
            sb.append(line);
            newContent.add(sb.reverse().toString());
            sb.setLength(0);
        }
        return newContent;
    }

    public static String writeFile(String file, List<String> content) {
        String newFile = file.substring(0, file.lastIndexOf("/") + 1) + "output.txt";
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
        List<String> content = readFile(file);
        for (String line: content) {
            System.out.println(line);
        }
    }
}