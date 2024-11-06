class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()){
            return false;
        }
    // int count=0;
    int j=0;
    for(int i=0;i<t.length() && j<s.length();i++){
        char ch=t.charAt(i);
        if(ch==s.charAt(j)){
            // count++;
            j++;
        }
    }
    if(j==s.length()){
        return true;
    }
    return false;
    }
}