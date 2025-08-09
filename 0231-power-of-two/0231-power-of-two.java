class Solution {
    public boolean isPowerOfTwo(int n) {
         if(n<1){
            return false;
        }
        int bit =n & (n-1);
        if ( bit==0){
            return true;
        }
        else{
            return false;
        }
    }
}