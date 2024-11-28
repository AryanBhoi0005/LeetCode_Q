class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int key:nums){
            map.put(key,map.getOrDefault(key,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)==1){
                sum+=key;
            }
        }
        return sum;
    }
}