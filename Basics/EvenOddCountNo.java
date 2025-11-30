public class EvenOddCountNo {
    public static void main(String[] args) {
        int num = 4562;
        int oddCount = 0;
        int evenCount = 0;
        int count = 0;
        while (num != 0) {
            count = num % 10;
            if (count % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            num = num / 10;
        }
        System.out.println("Total no of even no's is " + evenCount);
        System.out.println("Total no of odd no's is " + oddCount);

    }

}
