from typing import List

class HW6:
    def threeSum(self, nums: List[int]) -> List[List[int]]:

        nums.sort()
        result = []
        
        ## Iterates through array
        for i in range(len(nums) - 2):
            ## Checks for duplicate triplets
            if i == 0 or (i > 0 and nums[i] != nums[i-1]):
                ## Creates two pointers, pointer j that starts at the beginning of the array
                ## pointer k that starts at the end of the array
                
                ## j = left
                ## k = right
                j = i+1
                k = len(nums) - 1
                
                ## If total equals zero, add triplet to list, increment of decrement until
                ## we find distinct elements
                while j < k:
                    total = nums[i] + nums[j] + nums[k]
                    if total == 0:
                        result.append([nums[i], nums[j], nums[k]])
                        
                        while j < k and nums[j] == nums[j+1]:
                            j+=1
                        while j < k and nums[k] == nums[k-1]:
                            k-=1
                        j+=1
                        k-=1
                    elif total < 0:
                        j+=1
                    else:
                        k-=1

        return result

threesum = HW6()
print(threesum.threeSum([0,1,1]))
print(threesum.threeSum([-5,0,5,10,-10,0]))