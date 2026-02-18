
public class FirstNFibonacci {

    public int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }

    }

    public static void main(String[] args) {
        FirstNFibonacci fnf = new FirstNFibonacci();
        int N = 7;
        for (int i = 0; i < N; i++) {
            System.out.print(fnf.fib(i) + " ");
        }
    }
}
