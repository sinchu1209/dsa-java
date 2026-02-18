package LinearSearch;

public class IndexOfElement {
    public static void main(String[] args) {
        int[] arr = { 10, 25, 7, 40, 15 };
        int target = 7;
        int index = -1; //default index if element not found
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
                break;
            }
        }
        System.out.println(index);
    }
}
/*
Time Complexity: O(n)

Space Complexity: O(1) */