
public class RecursiveFactorial {

    public int fact(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        RecursiveFactorial fact1 = new RecursiveFactorial();
        System.out.println(fact1.fact(6));

    }
}
