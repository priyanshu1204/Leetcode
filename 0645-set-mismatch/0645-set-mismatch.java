class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup = -1, missing = -1;

        // Mark visited numbers by negating their indices
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                dup = Math.abs(nums[i]); // already visited => duplicate
            } else {
                nums[index] = -nums[index];
            }
        }

        // Find missing number (positive index)
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                missing = i + 1;
            }
        }

        return new int[]{dup, missing};
    }
}