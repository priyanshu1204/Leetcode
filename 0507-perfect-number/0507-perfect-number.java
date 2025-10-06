class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) return false; // 1 is not a perfect number
       int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            return true;
        }
        return false;
    }
}