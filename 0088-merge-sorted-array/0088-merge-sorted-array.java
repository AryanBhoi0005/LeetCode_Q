class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            for(int k=0;k<nums2.length;k++){
                nums1[k]=nums2[k];
            }
        }
        int idx=m;
        int i=0;
        while(idx<n+m){
            nums1[idx]=nums2[i];
            idx++;
            i++;
    }
    Arrays.sort(nums1);
    }
}