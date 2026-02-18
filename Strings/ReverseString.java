
class ReverseString {

    public static void main(String[] args) {
        String name = "Hello, World!";
        StringBuilder rev = new StringBuilder();
        for (int i = name.length() - 1; i >= 0; i--) {
            rev.append(name.charAt(i));
        }
        System.out.println(rev.toString());
        System.out.println(new StringBuilder(name).reverse().toString());
    }
}
