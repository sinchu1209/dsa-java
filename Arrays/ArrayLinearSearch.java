package Arrays;

public class ArrayLinearSearch {

    public static void main(String[] args) {
        int[] arr = {6, 11, 3, 15, 7};
        int target = 15;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Found at index " + i);
                return;
            }
        }
        System.out.println("Not Found");
    }
}
