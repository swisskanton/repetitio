import java.util.HashMap;

public class TelephoneBook {
    //We are going to represent our contacts in a map where both the keys and values are strings.
    //
    //Create a map with the following key-value pairs:
    //Name (key)	Phone number (value)
    // William A. Lathan	405-709-1865
    // John K. Miller	402-247-8568
    // Hortensia E. Foster	606-481-6467
    // Amanda D. Newland	319-243-5613
    // Brooke P. Askew	307-687-2982
    //Create an application which prints out the answers to the following questions:
    // - What is John K. Miller's phone number?
    // - Whose phone number is 307-687-2982?
    // - Do we know Chris E. Myers' phone number? (yes/no)
    //The full output of your main method should be the following:
    //
    //402-247-8568
    //Brooke P. Askew
    //no

    public static void main(String[] args) {
        HashMap<String, String> book = new HashMap<>(){{
            put("William A. Lathan", "405-709-1865");
            put("John K. Miller", "402-247-8568");
            put("Hortensia E. Foster", "606-481-6467");
            put("Amanda D. Newland", "319-243-5613");
            put("Brooke P. Askew", "307-687-2982");
        }};
        System.out.println(book.get("John K. Miller"));
        System.out.println(bookGetKey(book,"307-687-2982"));
        System.out.println(doWeKnowUserPhoneNumber(book, "Chris E. Myers"));
    }

    public static String bookGetKey(HashMap<String, String> map, String value) {
        String result = "";
        for (HashMap.Entry<String, String> entry : map.entrySet()) {
            if(entry.getValue().equals(value)){
                result = entry.getKey();
                break;
            }
        }
        return result;
    }

    public static String doWeKnowUserPhoneNumber(HashMap<String, String> map, String value) {
        return map.containsKey(value) ? "yes" : "no";
    }
}