public class BSAscDes {
    public static void main(String[] args) {
        int[] arr = {90, 80, 70, 60, 50, 40, 30, 20, 10};
        int target = 70;
        int result = orderAgnostics(arr, target);
        System.out.println("Element found at index: " + result);
    }

    static int orderAgnostics(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        boolean isAsc = arr[low]<arr[high];
        while(low<=high){
            int mid= low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            if (isAsc) {
                if(target<arr[mid]){
                    high=mid-1;   
            } else{
                low=mid+1;
            }
        }       else{
                if(target>arr[mid]){
                    high=mid-1;   
            } else{
                low=mid+1;
            }
        }
    }
        return -1;
    }
}
