import java.util.HashMap;

public class MostFrequentWord {
    //Write a function that receives a sentence (string) as a parameter and returns the most frequent word of that sentence. If there is more than one such word return any one of them.
    //
    //Test the method with the sentence from John Updike’s 'Rabbit, Run':
    //
    //But then they were married (she felt awful about being pregnant before but
    //Harry had been talking about marriage for a while and anyway laughed when
    //she told him in early February about missing her period and said Great she
    //was terribly frightened and he said Great and lifted her put his arms around
    //under her bottom and lifted her like you would a child he could be so
    //wonderful when you didn’t expect it in a way it seemed important that you
    //didn’t expect it there was so much nice in him she couldn’t explain to
    //anybody she had been so frightened about being pregnant and he made her
    //be proud) they were married after her missing her second period in March
    //and she was still little clumsy dark-complected Janice Springer and her
    //husband was a conceited lunk who wasn’t good for anything in the world Daddy
    //said and the feeling of being alone would melt a little with a little drink.
    //Expected result: and
    //
    //BONUS: Using a simple split(" ") may produce some incorrect words, e.g. "(she" instead of "she" or "drink." instead of "drink". Can you fix that?
    //
    //a (a) a, b b c
    //Expected result: a

    public static void main(String[] args) {
        String text1 = """
                But then they were married (she felt awful about being pregnant before but
                Harry had been talking about marriage for a while and anyway laughed when
                she told him in early February about missing her period and said Great she
                was terribly frightened and he said Great and lifted her put his arms around
                under her bottom and lifted her like you would a child he could be so
                wonderful when you didn’t expect it in a way it seemed important that you
                didn’t expect it there was so much nice in him she couldn’t explain to
                anybody she had been so frightened about being pregnant and he made her
                be proud) they were married after her missing her second period in March
                and she was still little clumsy dark-complected Janice Springer and her
                husband was a conceited lunk who wasn’t good for anything in the world Daddy
                said and the feeling of being alone would melt a little with a little drink.""";
        String text2 = "a (a) a, b b c";
        System.out.println(mostFrequent(text1));
        System.out.println(mostFrequent(text2));
    }

    public static String mostFrequent(String text) {
        HashMap<String, Integer> words = new HashMap<>();
        for (String x: text.split(" ")) {
            String word = x.replaceAll("[^a-z^A-Z]", "").toLowerCase();
            if (words.containsKey(word))
                words.put(word, words.get(word) + 1);
            else
                words.put(word, 1);
        }
        int max = 0;
        String result = "";
        for (String x: words.keySet()) {
            if (max < words.get(x)) {
                max = words.get(x);
                result = x;
            }
        }
        return result;
    }
}
