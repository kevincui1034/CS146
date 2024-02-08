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