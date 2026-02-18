
public class ArrayMissingNoXOR {

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 5};
        int xor1 = 0;
        int xor2 = 0;
        for (int i = 1; i < arr.length + 1; i++) {
            xor1 ^= i;
        }
        for (int j = 0; j < arr.length; j++) {
            xor2 ^= arr[j];
        }
        int misNo = xor1 ^ xor2;
        System.out.println(misNo);

    }
}
