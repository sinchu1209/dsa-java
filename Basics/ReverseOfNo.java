
public class ReverseOfNo {

    public static void main(String[] args) {
        int num = 4563;
        int reverse = 0;
        int count = 0;
        while (num != 0) {
            count = num % 10;
            reverse = reverse * 10 + count;
            num = num / 10;

        }
        System.out.println(reverse);
    }
}
