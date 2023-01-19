import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class BalancedWordsCounter {

    public static int count(String word) {
        if (word == null) throw new RuntimeException("word must not be null");
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isLetter(word.charAt(i))) {
                throw new RuntimeException("word must contain letter characters only");
            }
        }
        
        int count = 0;
        for (int start = 0; start < word.length(); start++) {
            for (int end = start + 1; end <= word.length(); end++) {
                Map<Character, Integer> characterCount = new HashMap<>();
                for (int i = start; i < end; i++) {
                    characterCount.compute(word.charAt(i), (k, v) -> v == null ? 1 : v + 1);
                }
                int lastCharacterCount = -1;
                boolean isBalanced = true;
                for (Entry<Character, Integer> entry : characterCount.entrySet()) {
                    if (lastCharacterCount == -1) {
                        lastCharacterCount = entry.getValue();
                    }
                    if (entry.getValue() != lastCharacterCount) {
                        isBalanced = false;
                        break;
                    }
                }
                if (isBalanced) {
                    count++;
                }
            }
        }
        return count;
    }
}
