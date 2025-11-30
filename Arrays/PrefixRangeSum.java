
public class PrefixRangeSum {

    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 7, 4};

        // Step 1: Build prefix sum array
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Step 2: L and R values
        int L = 2;
        int R = 4;

        // Step 3: Calculate sum(L, R)
        int sum;
        if (L == 0) {
            sum = prefix[R];
        } else {
            sum = prefix[R] - prefix[L - 1];
        }

        // Step 4: Print result
        System.out.println("Sum from index " + L + " to " + R + " = " + sum);
    }
}
