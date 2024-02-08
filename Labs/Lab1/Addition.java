import java.util.Arrays;

public class Addition {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 19;
        int check = 0;

        for (int i : nums) {
            int k = target - i;
            if (Arrays.stream(nums).anyMatch(x -> x == k)) {
                System.out.println(i + " + " + k + " = " + target);
                break;
            } else {
                check++;
            }
        }

        if (check >= nums.length) {
            System.out.println("Numbers in array cannot add up to target.");
        }
    }
}

// Iterates through the array and subtracts the target by the index of the array until it equals a number that
// exists in the array