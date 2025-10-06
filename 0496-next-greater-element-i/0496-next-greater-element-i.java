class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];

        // For each element in nums1
        for (int i = 0; i < nums1.length; i++) {
            int current = nums1[i];
            int nextGreater = -1; // default value if none found

            // Find position of current in nums2
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == current) {
                    // From that position, look for next greater element
                    for (int k = j + 1; k < nums2.length; k++) {
                        if (nums2[k] > current) {
                            nextGreater = nums2[k];
                            break; // stop once found
                        }
                    }
                    break; // stop once we locate current in nums2
                }
            }

            result[i] = nextGreater;
        }

        return result;
    }
}