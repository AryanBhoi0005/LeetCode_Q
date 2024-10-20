class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
           Integer count = map.get(t.charAt(i));
            if (count == null) {
                return false;
            }
            
            if (count == 1) {
                map.remove(t.charAt(i));
            } else {
                map.put(t.charAt(i), count - 1);
            }
        }
         return map.isEmpty();
    }
}