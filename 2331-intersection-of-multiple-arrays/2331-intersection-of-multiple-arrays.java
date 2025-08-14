class Solution {
    public List<Integer> intersection(int[][] nums) {
    Map<Integer,Integer> map=new HashMap<>();
    List<Integer> list=new ArrayList<>();
int n=nums.length;
for(int i=0;i<nums.length;i++){
    for(int j=0;j<nums[i].length;j++){
//to add the key and value in hashmap if not ther add default 0
//else increase value
        int curr=nums[i][j];
             map.put(curr, map.getOrDefault(curr, 0) + 1);
        }
    }
//iterat the value in map to check the keys value is length of n
//if then add in list
    for(int key:map.keySet()){
        if(map.get(key)==n){
            list.add(key);
        }
    }
    Collections.sort(list);
return list;



    }
}