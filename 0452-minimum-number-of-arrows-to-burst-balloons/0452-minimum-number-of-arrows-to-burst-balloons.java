class Solution {
    public int findMinArrowShots(int[][] points) {
         int n = points.length;
        Arrays.sort(points,(a,b)->(a[1]-b[1]));
        int prev[] = points[0];
        int ans = 1;
        for(int i=1; i<n; i++){
            if(prev[1]>=points[i][0] && prev[1]<=points[i][1]) continue;
            else{
                ans++;
                prev = points[i];
            }
        }
        return ans;
        
    }
}