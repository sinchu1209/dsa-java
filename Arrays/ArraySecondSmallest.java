
public class ArraySecondSmallest {

    public static void main(String[] args) {
        int[] arr = {4, 1, 9, 2, 7};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min && arr[i] < secondMin) { 
                
                secondMin = arr[i];
            }
        }
        System.out.println("The second smallest number is: " + secondMin);

    }
}
