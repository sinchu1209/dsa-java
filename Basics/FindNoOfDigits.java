
public class FindNoOfDigits {

    public static void main(String[] args) {
        int num = 4563;
        int count = 0;
        while (num != 0) {
            num = num / 10;

            count++;
        }
        System.out.println("The no of digits are " + count);

    }
}
