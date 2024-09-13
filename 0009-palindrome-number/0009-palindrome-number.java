class Solution {
    public boolean isPalindrome(int x) {
        String Palin=Integer.toString(x);
        int start=0;
        int end=Palin.length()-1;
        int mid=start+end/2;

        if(x<0){
            return false;
        }
        while(start<=mid){
            if(Palin.charAt(start)!=Palin.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}