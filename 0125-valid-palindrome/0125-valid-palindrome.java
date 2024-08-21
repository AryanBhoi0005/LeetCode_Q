class Solution {
    static boolean PalinHelper(String s,int left,int right){
      if(left>right){
        return true;
      }
      else if(s.charAt(left)!=s.charAt(right)){
        return false;
      }
      return PalinHelper(s,left+1,right-1);
    
    }
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        int n=s.length();
        return PalinHelper(s,0,n-1);
    }
}