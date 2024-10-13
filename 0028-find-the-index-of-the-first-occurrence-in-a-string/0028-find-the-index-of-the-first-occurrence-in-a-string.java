class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
           for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                int j=0;
                int k=i;
                while(j<needle.length()){
                if(needle.charAt(j)!=haystack.charAt(k)){
                   break;
                }
                else{
                j++;
                k++;
                }
                }
                if(j==needle.length()){
                   return i; 
                }
           }
       
    }
}
            return -1;
    }
}