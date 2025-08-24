class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0, zeros = 0, maxLen = 0;

        //Keep track of how many 0s are in the window.

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeros++;
            }

            // Shrink window if more than 1 zero
            //zeros > 1, shrink the window from the left until only 1 zero remains.
            while (zeros > 1) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }

            // length of window minus one deletion
            //right - left (because one element is deleted).
            maxLen = Math.max(maxLen, right - left);
        }

        return maxLen;
    }
}
