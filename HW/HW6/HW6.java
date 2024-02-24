import java.util.*;

public class HW6 {
    public List<List<Integer>> threeSum(int[] nums) {
        // Your code here
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        // Iterates through array
        for (int i= 0; i < nums.length - 2; i++) {
            // Checks for duplicate triplets
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                // j = left
                // k = right
                int j = i+1;
                int k = nums.length -1;

                // Creates two pointers, pointer j that starts at the beginning of the array
                // pointer k that starts at the end of the array
                while (j < k) {
                    int total = nums[i] + nums[j] + nums[k];

                    // If total equals zero, add triplet to list
                    if (total == 0) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));

                        // Skips duplicates
                        while (j < k && nums[j] == nums[j+1]) {
                            j++;
                        }
                        while (j < k && nums[k] == nums[k-1]) {
                            k --;
                        }

                        j++;
                        k--;
                    }
                    // If total is less than zero, move pointer j to the right
                    else if (total < 0) {
                        j++;
                    }
                    // If total is greater than zero, move pointer k to the left
                    else {
                        k--;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        HW6 threesum = new HW6();
        int[] num = {0,1,1};
        List<List<Integer>> result = threesum.threeSum(num);
        System.out.println(result);

        int[] num2 = {-5,0,5,10,-10,0};
        List<List<Integer>> result2 = threesum.threeSum(num2);
        System.out.println(result2);
    }
}