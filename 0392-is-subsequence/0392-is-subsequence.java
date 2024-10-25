class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        if (s.equals(t)) return true;
        
        int j = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(j) == t.charAt(i)) {
                j++;
                if (j == s.length()) return true; // All characters found
            }
        }
        
        return j == s.length(); // Check if all characters were matched
    }
}