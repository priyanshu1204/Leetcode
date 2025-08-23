class Solution {
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        int maxi=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            maxi=Math.max(nums[i],maxi);
        }
        int low=maxi;
        int high=sum;
        int res=0;
        while(low<=high){
            int mid=(low+high)/2;
            int ans=possible(nums,mid);
            if(ans<=k){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
       return res;
    }
    public static int possible(int[] nums,int mid){
        int sum=0;
        int cnt=1;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>mid){
                cnt++;
                sum=nums[i];
            }
        }
        return cnt;
        
    }
}