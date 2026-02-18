
public class BasicBS {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 7, 10, 15, 20 };
        int target = 10;
        int low = 0;
        int high = arr.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                index = mid;
                break;
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
 * Complexity (confirming your understanding)
 * 
 * Time Complexity: O(log n)
 * 
 * Space Complexity: O(1)
 * 
 * 🧠 One-line interview explanation (memorize this)
 * 
 * “Binary search works by repeatedly halving the search space in a sorted
 * array, giving logarithmic time complexity.”
 * “We compare the middle element with the target and eliminate half of the
 * array each time, updating low or high until the element is found or the range
 * becomes invalid.”
 */