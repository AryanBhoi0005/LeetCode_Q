class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            for(int k=0;k<nums2.length;k++){
                nums1[k]=nums2[k];
            }
        }
        int idx=-1;
        for(int i=n+m-1;i>=0;i--){
            if(nums1[i]!=0){
               idx=i+1;
               break;
            }
        }
        if(idx!=-1){
           int i=0;
            while(idx<nums1.length && i<nums2.length){
                nums1[idx]=nums2[i];
                i++;
                idx++;
            }
        }
        Arrays.sort(nums1);
    }
}