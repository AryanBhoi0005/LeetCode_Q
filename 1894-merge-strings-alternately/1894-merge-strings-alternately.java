class Solution {
    public String mergeAlternately(String word1, String word2) {
        String str="";
        int i=0;
        int j=0;
        while(i<word1.length() && j<word2.length()){
            char ch1=word1.charAt(i);
            char ch2=word2.charAt(j);
            str=str+ch1+ch2;
            i++;
            j++;
        }
        if(i>=word1.length()){
           while(j<word2.length()){
            char ch=word2.charAt(j);
            str=str+ch;
            j++;
           } 
        }
        if(j>=word2.length()){
          while(i<word1.length()){
            char ch=word1.charAt(i);
           str=str+ch;
           i++;
          }
        }
        
        return str;
    }
}