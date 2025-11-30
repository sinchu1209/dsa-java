
public class LongSubarray1 {

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 1};
        int k = 7;
        int maxLength = 0;
        int start = 0;
        
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            while (currentSum > k) {
                currentSum -= arr[start];
                start++;
            }
        
        
            maxLength = Math.max(maxLength, i - start + 1);
        }
        System.out.println("Length of the longest " + k + " is: " + maxLength);
    }
}
