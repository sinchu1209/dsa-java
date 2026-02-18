
import java.util.HashMap;

public class FirstNonRepeating {

    public static void main(String[] args) {
        int[] arr = {9, 4, 9, 6, 7, 4};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1) {
                System.out.println("First non-repeating element is: " + arr[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No non-repeating element found.");
        }

    }
}
