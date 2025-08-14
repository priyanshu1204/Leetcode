class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        int n = nums.length;
        Set<String> set = new HashSet<>();

        // Outer loop for start index
        for (int i = 0; i < n; i++) {
            int countDivisible = 0;
            StringBuilder sb = new StringBuilder();

            // Inner loop for end index
            for (int j = i; j < n; j++) {
                // Check divisibility
                if (nums[j] % p == 0) {
                    countDivisible++;
                }

                // If more than k divisible elements, break
                if (countDivisible > k) break;

                // Build string representation of subarray
                sb.append(nums[j]).append(",");

                // Add to set for uniqueness
                set.add(sb.toString());
            }
        }

        // Result is the size of the set
        return set.size();
    }
}