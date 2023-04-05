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
        Path path = Paths.get(this.fileName);
        List<String> content = new ArrayList<>();
        content.add("- " + args[1]);
        try {
            Files.write(path, content, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public void listTasks() {
        List<String> tasks = getTasks();
        if (tasks.size() > 0) {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.printf(" %d - %s %s\n", i + 1, (tasks.get(i).charAt(0) == '+') ? "[x]" : "[ ]", tasks.get(i).substring(1));
            }
        } else {
            System.out.println("No todos for today! :)");
        }
    }

    public void removeTask(String[] args) {
        List<String> tasks = getTasks();
        int index = Integer.parseInt(args[1]);
        tasks.remove(index - 1);
        saveTasks(tasks);
    }

    public void completedTask(String[] args) {
        List<String> tasks = getTasks();
        int index = Integer.parseInt(args[1]);
        tasks.set(index - 1, "+" + tasks.get(index - 1).substring(1));
        saveTasks(tasks);
    }

    public boolean IsCommandCorrect(String[] args) {
        if (args.length > 0)
            switch (args[0]) {
                case "-l" -> {
                    if (args.length > 1) {
                        System.err.println("Unsupported argument");
                        return false;
                    }
                }
                case "-a" -> {
                    if (args.length < 2) {
                        System.err.println("Unable to remove: no index provided");
                        return false;
                    }
                }
                case "-r", "-c" -> { return checkNumberArgument(args); }
                default -> {
                    System.err.println("Unsupported argument");
                    return false;
                }
            }
        return true;
    }

    private boolean checkNumberArgument(String[] args) {
        if (args.length < 2) {
            System.err.println("Unable to remove: no index provided");
            return false;
        } else {
            if (isInt(args[1])) {
                List<String> tasks = getTasks();
                int index = Integer.parseInt(args[1]);
                if (index < 1 || tasks.size() < index) {
                    System.err.println("Unable to remove: index is out of bound");
                    return false;
                }
            } else {
                System.err.println("Unable to remove: index is not a number or not a whole number");
                return false;
            }
        }
        return true;
    }

    private boolean isInt(String strNum) {
        try {
            int num = Integer.parseInt(strNum);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private List<String> getTasks() {
        Path path = Paths.get(this.fileName);
        List<String> content = new ArrayList<>();
        try {
            content = Files.readAllLines(path);
        } catch (IOException e) {
            System.err.println(e);
        }
        return content;
    }

    private void saveTasks(List<String> content) {
        Path path = Paths.get(this.fileName);
        try {
            Files.write(path, content);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}