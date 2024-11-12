class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1){
            return 1;
        }
        
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count=0;
        boolean oddf=false;
        for(Character key:map.keySet()){
            if(map.get(key)%2==0){
                count+=map.get(key);
            }
            else{
                count+=map.get(key)-1;
                oddf=true;
            }
        }
        return oddf?count+1:count;
    }
}