class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
        list.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
        list.add(nums2[j]);
        }
        Collections.sort(list);
        int mid=list.size();
        double result=0.0;
        int between=0;
        if(mid%2!=0){
        result=list.get((mid/2));
        }else{
        between=mid/2;
        result=(list.get(between-1)+list.get(between))/2.0;
        }
        return result;
    }
}