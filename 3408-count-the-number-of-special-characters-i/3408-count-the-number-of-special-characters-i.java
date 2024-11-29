class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch>='a' && ch<='z'){
                set.add(ch);
            }
        }

        HashSet<Character> set1=new HashSet<>();
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch>='A' && ch<='Z'){
                set1.add(ch);
            }
        }
        int count=0;
        for(char key:set){
            char ch=Character.toUpperCase(key);
            if(set1.contains(ch)){
                count++;
            }
        }
        return count;
    }
}