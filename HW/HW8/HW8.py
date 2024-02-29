class HW8:
    def longestPalindrome(self, s):
        char_count = {}
        
        ## Count the frequency of each character in the string
        for char in s:
            char_count[char] = char_count.get(char, 0) + 1

        longest_length = 0
        odd = False
        
        for count in char_count.values():
            
            ## If the character count is even, we can form a palindrome
            if count % 2 == 0:
                longest_length += count
                
            ## If it's odd, add its count - 1 to the longest length because an odd character
            ## cannot form a palindrome
            else:
                longest_length += count - 1
                odd = True
        
        ## If there's at least one odd character, we can place that character in the middle of the palindrome
        ## So we add +1 to the length
        if odd:
            longest_length += 1
        
        return longest_length

hw8 = HW8()
test1 = "abccccdd"
test2 = "speediskey"

print(hw8.longestPalindrome(test1))
print(hw8.longestPalindrome(test2))
