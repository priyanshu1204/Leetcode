class Solution {
    public boolean detectCapitalUse(String word) {
        // Case 1: All uppercase
        if (word.equals(word.toUpperCase())) return true;
        
        // Case 2: All lowercase
        if (word.equals(word.toLowerCase())) return true;
        
        // Case 3: First letter uppercase, rest lowercase
        String first = word.substring(0, 1);
        String rest = word.substring(1);
        
        if (first.equals(first.toUpperCase()) && rest.equals(rest.toLowerCase())) return true;
        
        return false;
    }
}