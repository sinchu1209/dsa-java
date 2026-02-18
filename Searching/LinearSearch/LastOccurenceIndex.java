package LinearSearch;
public class LastOccurenceIndex {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 2, 7};
int target = 2;
for (int i = arr.length - 1; i >= 0; i--) {
    if (arr[i] == target) {
        System.out.println(i);
        break;
    }
}

    }
}
/*
Complexity (interviewer-level)

Time Complexity: O(n)
(Worst case: element at index 0)

Space Complexity: O(1) */