class Solution {
    public int findPeakElement(int[] nums) {
        int result=0;
        if(nums.length==2){
            if(nums[0]<nums[1]){
                result=1;
            }
            else{
                result=0;
            }
        }
        if(nums.length==1){
            result=0;
        }
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                result=i;
            }else if(nums[nums.length-1]>nums[nums.length-2]){
                result=nums.length-1;
            }
        }
        return result;
    }
}