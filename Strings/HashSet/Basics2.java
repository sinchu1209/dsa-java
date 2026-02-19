import java.util.HashSet;
public class Basics2 {
public static void main(String[] args) {
HashSet<Character> chars = new HashSet<>();
String str = "hello world";
for(int i=0;i<str.length();i++){
char c = str.charAt(i);
chars.add(c);
}
System.out.println(chars);
}
}
