
public class LastOccurencesBS {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 10, 10, 10, 18 };

        int target = 10;
        int low = 0;
        int high = arr.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                index = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            }

        }
        System.out.println(index);
    }

}
/*
 * Complexity
 * 
 * Time Complexity: O(log n)
 * 
 * Space Complexity: O(1)
 * “For last occurrence, after finding the target, I continue searching on the
 * right side to ensure I get the last index.”
 */
