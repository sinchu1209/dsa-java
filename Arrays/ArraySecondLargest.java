
class ArraySecondLargest {

    public int getLargest(int[] arr) {
        int count = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > count) {
                count = arr[i];
            }
        }
        return count;
    }

    public int getSecondLargest(int[] arr) {
        int count = getLargest(arr);
        int secLar = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != count && arr[i] > secLar) {
                secLar = arr[i];
            }
        }
        return secLar;
    }

    public static void main(String[] args) {
        ArraySecondLargest lar = new ArraySecondLargest();
        int arr[] = {12, 8, 0, 14, 5};
        int res = lar.getLargest(arr);
        int res1 = lar.getSecondLargest(arr);
        System.out.println("The largest number is: " + res);
        System.out.println("The Second largest number is: " + res1);
    }
}
// Another approach without using methods

// public class Main
// {
// 	public static void main(String[] args) {
// int[] arr = {10, 5, 8, 20, 3};
// 		int max=arr[0];
// 		for(int i=0;i<arr.length;i++){
// 		   if(arr[i]>max) {
// 		       max= arr[i];
// 		   }
// 		}
// // 		System.out.println(max);
// int secLar= Integer.MIN_VALUE;
// for(int i=0;i<arr.length;i++){
//     if(arr[i]!= max && arr[i]>secLar){
//     secLar= arr[i];
//     }
// }
// System.out.println(secLar);
// 	}
// }
