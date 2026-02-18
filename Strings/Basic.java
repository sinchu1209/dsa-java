
public class Basic {

    public static void main(String[] args) {
        String name = "hello world";
        // for (char c : name.toCharArray()) {
        //     System.out.println(c);
        // }
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }
}
