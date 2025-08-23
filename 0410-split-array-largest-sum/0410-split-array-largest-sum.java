class Solution {
    public int splitArray(int[] nums, int k) {
        int max = 0;
        long sum = 0;
        for (int num : nums) {
            max = Math.max(max, num);
            sum += num;
        }

        long left = max;   // lower bound
        long right = sum;  // upper bound
        long ans = sum;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            if (canSplit(nums, k, mid)) {
                ans = mid;
                right = mid - 1;  // try smaller
            } else {
                left = mid + 1;   // need bigger limit
            }
        }

        return (int) ans;
    }

    private boolean canSplit(int[] nums, int k, long maxSum) {
        int count = 1;
        long current = 0;

        for (int num : nums) {
            if (current + num > maxSum) {
                count++;
                current = 0;
            }
            current += num;
            if (count > k) return false;
        }

        return true;
    }
}