
public class ArrayReversing {

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 9};
        int i = 0;
        int j = arr.length - 1;
        int temp;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int num : arr) {
            System.out.println(num);
        }

    }
}
