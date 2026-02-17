
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 1, 2 };

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;

        }
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
/*
Complexity Analysis (Interview MUST)

Worst Case: 𝑂(n²) → reverse sorted

Best Case: 𝑂(n) → already sorted

Average Case: 𝑂(n²)

Space: 𝑂(1) (in-place)

Stable: ✅ Yes

Adaptive: ✅ Yes */
