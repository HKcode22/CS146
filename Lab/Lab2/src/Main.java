// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Map;
import java.util.HashMap;
public class Main {

    public static boolean anagaram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        Map<Character,Integer> charcountS = new HashMap<>();
        Map<Character, Integer> charcountT = new HashMap<>();

        for(char c : s.toCharArray()){
            charcountS.put(c, charcountS.getOrDefault(c,0)+1);
        }

        for(char c : t.toCharArray()){
            charcountT.put(c, charcountT.getOrDefault(c,0)+1);
        }

        return charcountS.equals(charcountT);

    }


    public static void main(String[] args) {
        System.out.println(anagaram("anagram", "nagaram"));
        System.out.println(anagaram("meow", "bark"));
    }
}