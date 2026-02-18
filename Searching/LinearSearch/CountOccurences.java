package LinearSearch;
public class CountOccurences {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 2, 7, 2};
int target = 2;
int count=0;
for(int i = 0; i < arr.length; i++) {
    if(arr[i] == target) {
        count++;
    }
}
System.out.println("The target occured "+count+" times in the array.");
    }
}
/*
Complexity (confirming your understanding)

Time Complexity: O(n)

Space Complexity: O(1)
“We traverse the array once and increment a counter whenever the target element is found.”
 */