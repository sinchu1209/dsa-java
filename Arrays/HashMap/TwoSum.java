
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {3, 8, 12, 4, 7};
        int target = 11;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                System.out.println("Pair found at indices: " + map.get(complement) + " and " + i);
            } else {
                map.put(arr[i], i);
            }
        }

    }

}
