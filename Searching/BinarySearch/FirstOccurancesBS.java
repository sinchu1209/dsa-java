
public class FirstOccurancesBS {
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
                high = mid - 1;
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
 * Complexity (confirming)
 * 
 * Time Complexity: O(log n)
 * 
 * Space Complexity: O(1)
 * For first occurrence, when we find the target, we store the index and
 * continue searching the left half by moving high = mid - 1.”
 */