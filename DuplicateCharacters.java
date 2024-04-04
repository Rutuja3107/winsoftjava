import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "Hello, World!";
        Map<Character, Integer> charCountMap = new HashMap<>();
        str = str.toLowerCase();
        str = str.replaceAll("[^a-zA-Z]", "");
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entrySet = charCountMap.entrySet();
        System.out.println("Duplicate Characters in the String:");
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
