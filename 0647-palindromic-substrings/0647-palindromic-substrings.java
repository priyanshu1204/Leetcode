class Solution {
     private void checkPalindrome(String s, int i, int j, int[] cnt) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            cnt[0]++; // Count *all* palindromes, including length 1
            i--;
            j++;
        }
    }
    public int countSubstrings(String s) {
         int[] cnt = new int[1]; // pass-by-reference counter

        for (int i = 0; i < s.length(); i++) {
            // Odd-length palindromes (centered at single char)
            checkPalindrome(s, i, i, cnt);
            
            // Even-length palindromes (centered between two chars)
            checkPalindrome(s, i, i + 1, cnt);
        }

        return cnt[0];
    }
        
    
}