package todoApplication;

public class TodoApp extends TodoHandler {

    public static void main(String[] args) {

        TodoApp app = new TodoApp();

        if (app.IsCommandCorrect(args))
                switch (args[0]) {
                    case "-l" -> app.listTasks();
                    case "-a" -> app.addNewTask(args);
                    case "-r" -> app.removeTask(args);
                    case "-c" -> app.completedTask(args);
                    default -> app.printUsage();
                }
        else
            app.printUsage();
    }
}
