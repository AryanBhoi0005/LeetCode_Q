class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder str=new StringBuilder("");
        for(int i=0;i<strs[0].length() && i<strs[strs.length-1].length();i++){
            if(strs[0].charAt(i)!=strs[strs.length-1].charAt(i)){
                String newStr=str.toString();
                return newStr;
            }
            str.append(strs[0].charAt(i));
        }
           String newStr=str.toString();
           return newStr;
    }
}