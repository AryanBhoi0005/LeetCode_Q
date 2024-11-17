class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        ArrayList<String> list=new ArrayList<>();
        int val=Integer.MAX_VALUE;
        for(int i=0;i<list2.length;i++){
            String temp=list2[i];
            if(map.containsKey(temp)){
               int idx=map.get(temp)+i;
               if (idx < val) {
                    list.clear();
                    list.add(temp);
                    val = idx;
                } else if (idx == val) {
                    list.add(temp);
                }
            }
        }
        
        return list.toArray(new String[list.size()]);
    }
}