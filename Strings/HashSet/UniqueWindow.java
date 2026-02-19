import java.util.HashSet;

public class UniqueWindow {

    public static void main(String[] args) {
        HashSet<Character> set = new HashSet<>();
        String str = "abcabcbb";
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < str.length(); right++) {
            char ch = str.charAt(right);
            if (!set.contains(ch)) {
                set.add(ch);
                int currentWindowSize = right - left + 1;
                maxLength = Math.max(maxLength, currentWindowSize);
            } else {
                while (set.contains(ch)) {
                    set.remove(str.charAt(left));
                    left++;
                }
                set.add(ch);
                int currentWindowSize = right - left + 1;
                maxLength = Math.max(maxLength, currentWindowSize);
            }

        }

        System.out.println(maxLength);

    }
}

/*
 * Time & Space Complexity
 * 
 * Time Complexity: O(n)
 * Each character is added and removed at most once.
 * 
 * Space Complexity: O(n)
 * HashSet stores up to n characters.
 */