package priorityQueue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private final static String file = "src/priorityQueue/events.txt";
    private final static Path path = Paths.get(file);

    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {

        List<String> events = new ArrayList<>();
        try {
            events = Files.readAllLines(path);
        } catch (IOException e) {
            System.err.println(e);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
