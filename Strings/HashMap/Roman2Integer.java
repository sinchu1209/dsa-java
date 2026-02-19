import java.util.HashMap;

public class Roman2Integer {
    public static void main(String[] args) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        String s = "MCMXCIV";
        int result=0;
        
      for (int i = 0; i < s.length(); i++) {

            int currentValue = romanMap.get(s.charAt(i));

            // Check if next character exists
            if (i + 1 < s.length()) {
                int nextValue = romanMap.get(s.charAt(i + 1));

                if (currentValue < nextValue) {
                    result -= currentValue;   // subtract
                } else {
                    result += current
                    Value;   // add
                }
            } else {
                // Last character → always add
                result += currentValue;
            }
        }

        System.out.println("Integer value: " + result);
    }
}
