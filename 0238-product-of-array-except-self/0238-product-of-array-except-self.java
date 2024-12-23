class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n = nums.length;
    int[] answer = new int[n]; //answer array return 
    
    int[] prefix = new int[n];
    int[] suffix = new int[n];
    
    // Step 1: Calculate prefix products
    prefix[0] = 1;  // Pehla element ke left me kuch nahi hota
    for (int i = 1; i < n; i++) {
        prefix[i] = prefix[i - 1] * nums[i - 1];
    }
    
    // Step 2: Calculate suffix products
    suffix[n - 1] = 1;  // Last element ka right me kuch nahi hota
    for (int i = n - 2; i >= 0; i--) {
        suffix[i] = suffix[i + 1] * nums[i + 1];
    }
    
    // Step 3: Multiply prefix and suffix
    for (int i = 0; i < n; i++) {
        answer[i] = prefix[i] * suffix[i];
    }
    
    return answer;
    }
}