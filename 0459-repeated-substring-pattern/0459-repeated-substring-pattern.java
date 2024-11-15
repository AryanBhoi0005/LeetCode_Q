class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String s2=s+s;
        String s1=s2.substring(1,s2.length()-1);
        if(s1.contains(s)){
            return true;
        }
        return false;
        
    }
}