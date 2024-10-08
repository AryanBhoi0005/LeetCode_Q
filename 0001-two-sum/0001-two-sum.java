class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
       int req=target-nums[i];
       if(map.containsKey(req)){
          return new int[]{map.get(req),i};
       }
       else{
        map.put(nums[i],i);
       }
       }
       return new int[]{};  // Return an empty array if no string is found 
    }
}