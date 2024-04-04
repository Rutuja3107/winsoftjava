import java.util.*;
public class WordCount {
    public static void main(String[] args) {
    String inputString = "somebody is goint by bus and coming by bus";
        String[] words = inputString.split("\\s+");
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
        word = word.replaceAll("[^a-zA-Z0-9]", "");
            word = word.toLowerCase();
            if (word.length() > 0) {
                if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
                } else {
                    wordCountMap.put(word, 1);
                }
            }
        }
        System.out.println("Word Counts:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
