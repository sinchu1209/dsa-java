
public class MaxSubarraySlidingWindow {

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 7, 8};
        int k = 3;
        int firstWindowSum = 0;
        int maxSum = firstWindowSum;
        for (int i = 0; i < k; i++) {
            firstWindowSum += arr[i];
        }
        int newSum = 0;
        for (int i = k; i < arr.length; i++) {
            newSum = firstWindowSum - arr[i - k] + arr[i];
            firstWindowSum = newSum;
            if (newSum > maxSum) {
                maxSum = newSum;
            }
        }
        System.out.println("Maximum Subarray Sum of size " + k + " is: " + maxSum);
    }
}
