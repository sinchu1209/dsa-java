package LinearSearch;
public class FirstOccurenceIndex {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 2, 7};
int target = 2;
for (int i = 0; i < arr.length; i++) {
    if (arr[i] == target) {
        System.out.println(i);
        break;

    }
}
    }
}
/*
Complexity (confirming)

Time Complexity: O(n)

Space Complexity: O(1)
“Here we stop at the first match, whereas for counting/all occurrences we traverse the entire array.” */