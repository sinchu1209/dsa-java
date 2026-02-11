public class NeonNumber {
    public static void main(String[] args) {
        int num = 9;
        int originalNum = num;
        int square = num * num;
        int sum=0;
        while(square!=0){
            int digit = square%10;
            sum+=digit;
            square=square/10;
        }
        if(sum==originalNum){
            System.out.println(originalNum + " is a Neon Number.");
        } else {
            System.out.println(originalNum + " is not a Neon Number.");
        }
    }
}
