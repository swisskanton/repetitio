public class ElsoProject {
    public static void main(String[] args) {
        String result = censor("Ez a kutya nagyon aranyos egy kutya.", "kutya", "macska");
        System.out.println("Proba! " + result);
    }

    static String censor(String txt, String toChange, String word) {
        return txt.replaceAll(toChange, word);
    }
}
