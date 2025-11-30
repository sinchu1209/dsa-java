
public class Palindrome {

    public static void main(String[] args) {
        int num = 121;
        int original = num;
        int rev = 0;
        int count = 0;
        while (num != 0) {
            count = num % 10;
            rev = rev * 10 + count;
            num = num / 10;
        }
        if (original == rev) {
            System.out.println("The given number is a palindrome");
        } else {
            System.out.println("The given number is not a palindrome");
        }
    }
}
