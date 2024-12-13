//apna college
//find the pivot element meaning the element for which if we start from end the element next to it will be grater then it eg 123654 in this 5 is grater then 4 but 3 is less then 6 so 3 is pivot 
//step 2 finf the rightmost element grater then pivot ie 4
//swap both then number becomes 124653
//now the 124 will be fix and we will have o make least number combination out of 653 tthat is 356 that can be done by reversing them(pivot+1)element 
// eg 12543 = 2 pivot = 13542 = 13254 = answer
//lexiographically means in greater number order for 123 it is 123 then 132- 213 - 231 - 312 - 321
class Solution {
    public void nextPermutation(int[] nums) {
        int ind1=-1;
        int ind2=-1;
        // step 1 find breaking point 
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind1=i;
                break;
            }
        }
        // if there is no breaking  point 
        if(ind1==-1){
            reverse(nums,0);
        }
        
        else{
            // step 2 find next greater element and swap with ind2
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[ind1]){
                    ind2=i;
                    break;
                }
            }

            swap(nums,ind1,ind2);
            // step 3 reverse the rest right half
            reverse(nums,ind1+1);
        }
    }
    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    void reverse(int[] nums,int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}