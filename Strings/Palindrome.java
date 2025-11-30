
class Palindrome {

    public static void main(String[] args) {
        String str = "madam";
        int i = 0;
        int j = str.length() - 1;
        boolean isPalindrome = true;

        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                isPalindrome = true;
                i++;
                j--;
            } else {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}
