
public class Fibonacci1 {

    public static void main(String[] args) {
        int N = 8;
        int prev = 0;
        int curr = 1;
        System.out.print(prev + " " + curr + " ");
        for (int i = 2; i < N; i++) {
            int next = prev + curr;
            System.out.print(next + " ");
            prev = curr;
            curr = next;
        }
    }
}
