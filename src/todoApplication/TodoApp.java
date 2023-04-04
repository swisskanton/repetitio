package todoApplication;

public class TodoApp extends TodoHandler {

    public static void main(String[] args) {

        TodoApp app = new TodoApp();

        if (args.length > 0)
                switch (args[0]) {
                    case "-l" -> app.listTasks();
                    case "-a" -> app.addNewTask(args);
                    case "-r" -> app.removeTask(args);
                    case "-c" -> System.out.println(app.commands.get("-c"));
                    default -> {
                        System.err.println("Unsupported argument");
                        app.printUsage();
                    }
                }
        else
            app.printUsage();
    }
}
