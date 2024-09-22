class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int []copy=arr.clone();
        Arrays.sort(copy);

        Map<Integer,Integer> map=new HashMap<>();
        int rank=1;
        for(int num:copy){
            if(!map.containsKey(num)){
                map.put(num,rank);
                rank++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
        }
}