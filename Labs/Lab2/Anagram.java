import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s = "eleven plus two";
        String t = "twelve plus one";
        System.out.println(isAnagram(s.trim(), t.trim()));
    }

    public static String isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return "s and t are not anagrams";
        } else {
            char[] sArray = s.toCharArray();
            char[] tArray = t.toCharArray();
            Arrays.sort(sArray);
            Arrays.sort(tArray);
            if (Arrays.equals(sArray, tArray)) {
                return "s and t are anagrams";
            } else {
                return "s and t are not anagrams";
            }
        }
    }
}
