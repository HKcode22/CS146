public class Main {
    public static boolean palindrome(String s) {
        String cleanstr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return cleanstr.contentEquals(new StringBuilder(cleanstr).reverse());
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(palindrome("A man, a plan, a canal: Panama"));
        System.out.println(palindrome("cat dat"));
    }
}
