
//Problem 31: NextPermutation

import java.util.Arrays;

class Solution {

    // Find the number
    // Start traversing from rightmost end find the first digit(x) which satisfy
    // condition (arr[i] > arr[i-1])
    // store index i
    // find the second smallest digit(y) on right side of x
    // swap x and y
    // sort / reverse all the digits on right of index i

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void nextPermutation(int[] nums) {

        int i;
        for (i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1])
                break;
        }

        if (i > 0) {
            int firstMin = nums[i - 1];
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > firstMin && nums[j] < nums[min]) {
                    min = j;
                }
            }
            swap(nums, i - 1, min);

            Arrays.sort(nums, i, nums.length);
        } else { // not possible case
            Arrays.sort(nums, 0, nums.length);
        }

    }
}