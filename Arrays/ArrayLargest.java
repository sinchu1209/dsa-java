

class ArrayLargest {

    public int getLargest(int[] arr) {
        int count = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > count) {
                count = arr[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayLargest lar = new ArrayLargest();
        int arr[] = {12, 8, 0, 14, 5};
        int res = lar.getLargest(arr);
        System.out.println("The largest number is: " + res);
    }
}
