class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int[] count = new int[256];
        for (int right = 0, left = 0; right < s.length(); right++) {
            count[s.charAt(right)]++;
            while (count[s.charAt(right)] > 1) {
                count[s.charAt(left++)]--;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}