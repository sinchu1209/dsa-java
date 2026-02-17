public class SelectionSort {
    public static void main(String[] args) {
        int[] arr= {5,3,4,1};
        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
}
/* 
Time Complexity → 𝑂(n²) (always)
Space Complexity → 𝑂(1)
Stable → ❌ No
Adaptive → ❌ No
📌 Key interview sentence:
“Selection sort always performs n² comparisons, even if the array is already sorted.”
*/