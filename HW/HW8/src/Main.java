import java.util.HashMap;

public class Main {
    public static int longestPalindrome(String s) {

        HashMap<Character, Integer> charCount = new HashMap<>();
        int length = 0;
        boolean odd = false;

        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

//        for (int i = 0; i < s.length(); i++) {
        for (int count : charCount.values()) {
//            int count = charCount.get(s.charAt(i));
            if (count % 2 == 0) {
//                System.out.println("If:");
//                System.out.println(charCount.values());
//                System.out.println("l " + length);
                length = length + count;
//                System.out.println("l " + length);
//                System.out.println("c " + count);

            }
            else {
//                System.out.println("Else:");
//                System.out.println(charCount.values());
//                System.out.println("l "+ length);
                length += count - 1;
                odd = true;
//                System.out.println("l "+length);
//                System.out.println("c "+count);


            }
        }

//        System.out.println(length);
        if (odd) {
            length += 1;
        }

//        System.out.println("-----------------------------------------------------------------------");
//        System.out.println(length);

        return length;
    }


    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }

}
