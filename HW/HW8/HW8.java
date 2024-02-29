import java.util.HashMap;

public class HW8 {
    public int longestPalindrome(String s) {
        int longest_length = 0;
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count the frequency of each character
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Checks for odd characters
        boolean odd = false;

        // Iterate through the character counts
        for (int count : charCount.values()) {
            // If the count is even, we can include all characters
            if (count % 2 == 0) {
                longest_length += count;
            } else {
                // If it's odd, add its count - 1 to the longest length because an odd character
                // cannot form a palindrome
                longest_length += count - 1;

                // Indicates that have found an odd character
                odd = true;
            }
        }
        //If there's at least one odd character, we can place that character in the middle of the palindrome
        // So we add +1 to the length
        if (odd) {
            longest_length++;
        }
        return longest_length;
    }
    public static void main(String[] args) {
        HW8 hw8 = new HW8();
        String s = "abccccdd";
        s = s.toLowerCase();
        String s2 = "speediskey";
        s2 = s2.toLowerCase();
        System.out.println(hw8.longestPalindrome(s));
        System.out.println(hw8.longestPalindrome(s2));

        // Extra test case
        String s3 = "apple";
        s3 = s3.toLowerCase();
        System.out.println(hw8.longestPalindrome(s3));
    }
}