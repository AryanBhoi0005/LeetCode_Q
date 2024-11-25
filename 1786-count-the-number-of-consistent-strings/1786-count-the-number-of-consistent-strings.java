class Solution {
    public int countConsistentStrings(String allowed, String[] words) {        
       
        int count=0;
        HashMap<Character,Integer>map= new HashMap<>();
        for(int i=0;i<allowed.length();i++){
            char ch=allowed.charAt(i);
            map.put(ch,1);
        }

        for(String key:words){
             boolean flag=true;
            String word=key;
            for(int j=0;j<word.length();j++){
                char ch=word.charAt(j);
                if(!map.containsKey(ch)){
                    flag=false;
                }
            }
            if(flag==false){
                continue;
            }
            count++;
        }
        return count;
    }
}