nums = [0,1,2,3,4,5,6,7,8,9]
target = 18
check = 0

for i in nums:
    k = target - i
    if k in nums:
        print (i, "+", k, " = ", target)
        break
    else:
        check += 1
        
if check >= len(nums):
    print("Numbers in array cannot add up to target.")
    
## Iterates through the array and subtracts the target by the index of the array until it equals a number that
## exists in the array