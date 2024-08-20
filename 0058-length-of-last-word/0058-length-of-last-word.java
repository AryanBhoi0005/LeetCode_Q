class Solution {
    public int lengthOfLastWord(String s) {
        String newStr=s.trim();
        int count=0;
        for(int i=newStr.length()-1;i>=0;i--){
            if(newStr.charAt(i)!=' '){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}