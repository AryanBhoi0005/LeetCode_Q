class Solution {
    public int findMin(int[] nums) {
    int si=0;
    int ei=nums.length-1;
    int min=Integer.MAX_VALUE;
    while(si<=ei){
    // min=Math.min(nums[mid],min);
    int mid=si +(ei-si)/2;
    if(nums[si]<=nums[mid]){
       min=Math.min(nums[si],min);
       si=mid+1;
    }
    else{
        min=Math.min(nums[mid],min);
        ei=mid-1;
    }   
    }
    return min;
    }
}