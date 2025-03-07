public class App {

    public static String reverseString(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r += s.charAt(i);
        }
        return r;
    }

    public static void main(String[] args) {
        String fruit = "banana";
        char letter = fruit.charAt(0);

        System.out.println(letter);

        for (int i = 0; i < fruit.length(); i++) {
            char letterFruit = fruit.charAt(i);
            System.out.println(letterFruit);

        }

    }
}