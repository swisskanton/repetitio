public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";

        // Add "My to-do:" to the beginning of the `todoText`
        // Add " - Download games" to the end of the `todoText`
        // Add " - Diablo" to the end of the `todoText` applying an extra 4 space indention

        // Expected output:

        // My to-do:
        //  - Buy milk
        //  - Download games
        //      - Diablo
        todoText = "My to-do:\n" + todoText;
        todoText += " - Download games\n" + "    " + " - Diablo";
        //
        System.out.println(todoText);
    }
}