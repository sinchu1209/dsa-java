public class StrongNumber {
    public int fact(int n) {
        if (n == 0 || n == 1){
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
    public static void main(String[] args) {
        int num=145;
        int originalNum=num;
        int sum=0;
        StrongNumber sn=new StrongNumber();
        while(num!=0){
            int digit = num%10;
            int newfac = sn.fact(digit);
            sum+=newfac;
            num=num/10;
    }
        if(sum==originalNum){
            System.out.println(originalNum+" is a Strong Number.");
        } else {
            System.out.println(originalNum+" is not a Strong Number.");
        }
    }
}
