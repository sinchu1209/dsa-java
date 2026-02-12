public class LCMoftwo {
    int max(int a, int b){
        return (a>b)?a:b;
    }
    public static void main(String[] args) {
        int a=12;
        int b=18;
        LCMoftwo obj=new LCMoftwo();
        int lcm=0;
        int max= obj.max(a,b);
        while(true){
            if(max%a==0 && max%b==0){
                lcm=max;
                break;
            }
            max++;
        }
        System.out.println(lcm);
    }
}
