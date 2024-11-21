class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int key:nums1){
            map.put(key,map.getOrDefault(key,0)+1);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int key:nums2){
            if(map.containsKey(key)){
               if(map.get(key)==1){
                 map.remove(key);
               } 
               else{
                map.put(key,map.get(key)-1);
               }
               list.add(key);
            }
        }
        int sizeA=list.size();
        int arr[]=new int[sizeA];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}