class Solution {
    public int climbStairs(int n) {
        // Base cases
        if (n <= 2) {
            return n;
        }
        
        // Dynamic Programming approach
        // Only need to track the last two values (space optimized)
        int prev2 = 1; // ways to reach step 1
        int prev1 = 2; // ways to reach step 2
        
        // Calculate ways for each step from 3 to n
        for (int i = 3; i <= n; i++) {
            int current = prev1 + prev2; // ways(i) = ways(i-1) + ways(i-2)
            prev2 = prev1; // shift values
            prev1 = current;
        }
        
        return prev1;
    }
}