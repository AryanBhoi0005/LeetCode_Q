class Solution {
    public int scoreOfString(String s) {
        int total=0;
        for(int i=0;i<s.length()-1;i++){
            int val1=(int)s.charAt(i);
            int val2=(int)s.charAt(i+1);
             total+=Math.abs(val1-val2);
        }
        return total;
    }
}