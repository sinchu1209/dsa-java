import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String s1 = "aabbcc";
        String s2 = "abccba";
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if (!map.containsKey(ch)) {
                System.out.println("Not Anagram");
                return;
            } else {
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) < 0) {
                    System.out.println("Not Anagram");
                    return;
                }
            }

        }
        System.out.println("Anagram");
    }
}
/*
 * Time & Space Complexity
 * 
 * Time Complexity: O(n)
 * 
 * Space Complexity: O(n)
 * 
 * This is the best possible solution for this problem.
 * Interview One-Line Explanation (You should remember this)
 * 
 * “I use a HashMap to count character frequencies in the first string, then
 * decrease counts using the second string. If any count goes negative or a
 * character is missing, they’re not anagrams.”
 */