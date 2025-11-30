
public class GCDoftwo {

    int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static void main(String[] args) {

        int a = 12;
        int b = 18;
        GCDoftwo obj = new GCDoftwo();
        int gcd = 0;

        int min1 = obj.min(a, b);
        for (int i = 1; i <= min1; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);

    }
}
