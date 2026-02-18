
class Fibonacci {

    static int fib(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        int prev = 0;
        int curr = 1;

        for (int i = 2; i <= N; i++) {
            int next = (prev + curr) % 10; // only last digit
            prev = curr;
            curr = next;
        }

        return curr;
    }

    public static void main(String[] args) {
        System.out.println(fib(0));  // 0
        System.out.println(fib(5));  // 5
        System.out.println(fib(12)); // 4
        System.out.println(fib(20)); // 5
    }
}
