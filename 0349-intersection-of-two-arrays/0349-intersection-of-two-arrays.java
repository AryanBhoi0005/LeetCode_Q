class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> Newset=new HashSet<>();
        
        for(int i=0;i<nums1.length;i++){
        set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            int j=0;
            if(set.contains(nums2[i])){
               Newset.add(nums2[i]);
            }
        }
        int arr[]=new int[Newset.size()];
        int result=0;
        for(int keys:Newset){
            arr[result++]=keys;
        }
        return arr;
    }
}