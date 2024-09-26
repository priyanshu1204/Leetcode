class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<String> prefixes = new HashSet<>();
        
        // Insert all prefixes of elements in arr1 into the set
        for (int num : arr1) {
            String strNum = Integer.toString(num);
            for (int i = 1; i <= strNum.length(); i++) {
                prefixes.add(strNum.substring(0, i));
            }
        }

        int maxPrefixLength = 0;

        // Find the longest matching prefix from arr2
        for (int num : arr2) {
            String strNum = Integer.toString(num);
            for (int i = strNum.length(); i > 0; i--) {
                String prefix = strNum.substring(0, i);
                if (prefixes.contains(prefix)) {
                    maxPrefixLength = Math.max(maxPrefixLength, i);
                    break;
                }
            }
        }

        return maxPrefixLength;
    }
}