public class ArrayFindMissingNo {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 5};
        int n = arr.length +1;
        int sum1=0;
        int sum = n*(n+1)/2;
       
        for(int i=0;i<arr.length;i++){
            sum1+= arr[i];
        }
         int misNo = sum - sum1;
         System.out.println(misNo);
    }
}
