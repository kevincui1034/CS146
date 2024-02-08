def isPalindrome(s):
    if s == s[::-1]:
        return "It's a palindrome"
    else:
        return "It's not a palindrome"

string = "Racecar"        
s = string.lower()
print(isPalindrome(s))

## Reverses the string and if is equal then it returns "It's a palindrome"