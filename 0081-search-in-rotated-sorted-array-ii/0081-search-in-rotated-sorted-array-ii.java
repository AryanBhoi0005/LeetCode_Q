class Solution {
    public boolean search(int[] nums, int target) {
    int low=0;
    int high=nums.length-1;
    while(low<=high){
        if(nums[low]==target || nums[high]==target){
            return true;
        }
       else if(nums[low]<target){
          low++;
       }
       else{
        high--;
       }
    }
       return false;
    }
}