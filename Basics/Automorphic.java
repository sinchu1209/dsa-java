public class Automorphic {
    public static void main(String[] args) {
        int num =5;
        int originalNum = num;
        int square = num * num;

        while(num!=0){
            int digit = num%10;
            int squareDig = square%10;
            if(digit != squareDig){
                System.out.println(originalNum + " is not an Automorphic Number.");
                return;
            }
            num=num/10;
            square=square/10;
        }
        System.out.println(originalNum + " is an Automorphic Number.");
    }
}
