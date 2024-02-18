import java.util.HashMap;
import java.util.Map;

public class LetterFrequency {
    public static void main(String[] args) {
        String str = "hello world";
        Map<Character, Integer> frequencyMap = findLetterFrequency(str);
        
        System.out.println("Frequency of letters in the string:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<Character, Integer> findLetterFrequency(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch); // Consider case-insensitive letters
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }
        
        return frequencyMap;
    }
}
