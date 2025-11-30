
public class SumOfDigits {

    public static void main(String[] args) {
        int num = 4563;
        int sum = 0;
        int count = 0;
        while (num != 0) {
            count = num % 10;
            sum += count;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
