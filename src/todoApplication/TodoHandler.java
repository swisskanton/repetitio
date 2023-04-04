package todoApplication;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TodoHandler {

    HashMap<String, String> commands = new HashMap<>() {{
        put("-l", "Lists all the tasks");
        put("-a", "Adds a new task");
        put("-r", "Removes an task");
        put("-c", "Completes an task");
    }};

    //IntelliJ path: "src/myTasks.txt"
    //console path: "myTasks.txt";
    String fileName = "src/todoApplication/myTasks.txt";

    public void printUsage() {

        System.out.println("Command Line Todo application");
        System.out.println("=============================\n");
        System.out.println("Command line arguments:");
        for (String key: this.commands.keySet()) {
            System.out.printf("   %s   %s\n", key, this.commands.get(key));
        }
    }

    public void addNewTask(String[] args) {
        if (args.length < 2) {
            System.err.println("Unable to add: no task provided");
        } else {
            Path path = Paths.get(this.fileName);
            List<String> content = new ArrayList<>();
            content.add("- " + args[1]);
            try {
                Files.write(path, content, StandardOpenOption.APPEND);
            } catch (IOException e) {
                System.err.println(e);
            }
        }
    }

    public void listTasks() {
        List<String> content = new ArrayList<>();
        content = getContent();
        if (content.size() > 0) {
            for (int i = 0; i < content.size(); i++) {
                System.out.printf(" %d %s\n", i + 1, content.get(i));
            }
        } else {
            System.out.println("No todos for today! :)");
        }
    }

    public void removeTask(String[] args) {
        Path path = Paths.get(this.fileName);
        List<String> content = new ArrayList<>();
        if (args.length < 2)
            System.err.println("Unable to remove: no index provided");
        else {
            if (isInt(args[1])) {
                content = getContent();
                int index = Integer.parseInt(args[1]);
                if (content.size() < index || index < 1) {
                    System.err.println("Unable to remove: index is out of bound");
                } else {
                    content.remove(index - 1);
                    try {
                        Files.write(path, content);
                    } catch (IOException e) {
                        System.err.println(e);
                    }
                }
            } else {
                System.err.println("Unable to remove: index is not a whole number");
            }
        }
    }

    public boolean isInt(String strNum) {
        try {
            int num = Integer.parseInt(strNum);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private List<String> getContent() {
        Path path = Paths.get(this.fileName);
        List<String> content = new ArrayList<>();
        try {
            content = Files.readAllLines(path);
        } catch (IOException e) {
            System.err.println(e);
        }
        return content;
    }
}