def isAnagram(s,t):
    if len(s) != len(t):
        return "s and t are not anagrams"
    elif sorted(s) == sorted(t):
        return "s and t are anagrams"
    else:
        return "s and t are not anagrams"

s = "eleven plus twd"
t = "twelve plus one"
print(isAnagram(s.strip(),t.strip()))

## If length of string is not equal it cannot be an anagram
## Returns anagram if the sorted string s and t are the same, other it returns false