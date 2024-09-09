class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int n=nums.length-1;
        int high=n;
        int mid=0;

        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
               int temp=nums[high];
               nums[high]=nums[mid];
               nums[mid]=temp;
               high--;
            }
        }

    }
}