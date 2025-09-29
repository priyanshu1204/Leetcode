class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
         // Step 2: Check from largest side backwards
        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i - 2] + nums[i - 1] > nums[i]) {
                return nums[i - 2] + nums[i - 1] + nums[i];  // Valid triangle
            }
        }
        return 0;
    }
}