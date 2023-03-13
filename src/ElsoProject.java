package repetitio;

public class ElsoProject {
    public static void main(String[] args) {
        String result = censor("Ez a kutya nagyon aranyos egy kutya.", "kutya", "macska");
        System.out.println("Próba! " + result);
    }

    static String censor(String text, String toChange, String word) {
        String newText = text.replaceAll(toChange, word);
        return newText;
    }
}
