
public class ArrayNoAppearsOnce {

    public static void main(String[] args) {
        int[] arr = {7, 1, 7, 5, 1};
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
        }
        System.out.println(xor);
    }
}
