public class LCMEuclid {
    public static void main(String[] args) {
        int a=12;
        int b=18;
        int originalA=a;
        int originalB=b;
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        int gcd=a;
        int lcm=(originalA*originalB)/gcd;
        System.out.println("LCM of "+originalA+" and "+originalB+" is: "+lcm);
    }
}
