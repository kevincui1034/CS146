def isBadVersion(version):
    return version >= 4

def BadVersionCheck(n):
    for i in range(1, n+1):
        if isBadVersion(i):
            return i
        else:
            return "N/A"

n=3
print("Version '", BadVersionCheck(n), "' is the first bad version")