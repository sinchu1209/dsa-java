
public class CountOccurences {
    static int firstOccurence(int[] arr, int target) {
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
        return index;
    }

    static int lastOccurence(int[] arr, int target) {
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
        return index;
    }

    public static void main(String[] args) {
        CountOccurences count = new CountOccurences();
        int[] arr = { 2, 4, 10, 10, 10, 18 };
        int target = 10;
        int first = count.firstOccurence(arr, target);
        int last = count.lastOccurence(arr, target);
        int total = last - first + 1;
        System.out.println(total);
    }
}
/*
 * Complexity (Interview Point)
 * 
 * Time Complexity: O(log n)
 * 
 * Space Complexity: O(1)
 * “In a sorted array, count of occurrences can be found using binary search by
 * computing last − first + 1.”
 */