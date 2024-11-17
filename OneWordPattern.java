import java.util.HashMap;

public class OneWordPattern {

    public static boolean followsPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false; // The pattern and words must have the same length
        }

        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            // Check if character is already mapped to a different word
            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(word)) {
                    return false;
                }
            } else {
                charToWord.put(c, word);
            }

            // Check if word is already mapped to a different character
            if (wordToChar.containsKey(word)) {
                if (wordToChar.get(word) != c) {
                    return false;
                }
            } else {
                wordToChar.put(word, c);
            }
        }

        return true; // The pattern and string s follow the same mapping
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";

        System.out.println(followsPattern(pattern, s)); // Output: true

        pattern = "abba";
        s = "dog cat cat fish";
        System.out.println(followsPattern(pattern, s)); // Output: false

        pattern = "aaaa";
        s = "dog dog dog dog";
        System.out.println(followsPattern(pattern, s)); // Output: true

        pattern = "abba";
        s = "dog dog dog dog";
        System.out.println(followsPattern(pattern, s)); // Output: false
    }
}
