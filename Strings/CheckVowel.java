
public class CheckVowel {

    public static void main(String[] args) {
        String name = "hello world";
        int isVowel = 0;
        int notVowel = 0;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                isVowel++;

            } else {
                notVowel++;
            }
        }
        System.out.println("Number of vowels: " + isVowel);

    }
}
