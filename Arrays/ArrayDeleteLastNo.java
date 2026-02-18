
public class ArrayDeleteLastNo {

    public void deleteLast(int[] arr, int n) {
        if (n > 0) {
            arr[n - 1] = 0;
            n--;
        }
    }

    public static void main(String[] args) {
        ArrayDeleteLastNo obj = new ArrayDeleteLastNo();
        int[] arr = {4, 5, 6};
        int n = arr.length;
        obj.deleteLast(arr, n);
        System.out.print("Array after removeEnd: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
