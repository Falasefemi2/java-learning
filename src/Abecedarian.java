public class Abecedarian {

    public static boolean isAbecedarian(String s) {
        s = s.toLowerCase(); // convert to lowercase

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "femi";
        boolean ans = isAbecedarian(word);
        System.out.println(ans);
    }
}
