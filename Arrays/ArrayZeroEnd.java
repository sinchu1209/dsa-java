
public class ArrayZeroEnd {

    public static void main(String[] args) {
        int[] arr = {0, 5, 0, 3, 8};
        int temp;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for (int num : arr) {
            System.out.println(num);
        }
    }

}
