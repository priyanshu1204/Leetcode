class Solution {
    public boolean buddyStrings(String s, String goal) {
         if (s.length() != goal.length()) return false;

        // Case 2: If strings are equal, check for duplicate character
        if (s.equals(goal)) {
            int[] freq = new int[26];
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
                if (freq[c - 'a'] > 1) return true; // Found a duplicate char
            }
            return false; // No duplicates → can't swap to make same
        }

        // Case 3: Strings are different
        int first = -1, second = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (first == -1)
                    first = i;
                else if (second == -1)
                    second = i;
                else
                    return false; // more than 2 mismatches
            }
        }

        // Now we must have exactly two mismatches
        return (second != -1 &&
                s.charAt(first) == goal.charAt(second) &&
                s.charAt(second) == goal.charAt(first));
    }
}