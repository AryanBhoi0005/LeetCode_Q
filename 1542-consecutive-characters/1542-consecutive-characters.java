class Solution {
    public int maxPower(String s) {
        if(s.length()==1){
            return 1;
        }
      int n=s.length();
      int l=0;
      int r=0;
      int count=0;
      int val=0;
      while(r<n){
        char ch=s.charAt(l);
        char ch1=s.charAt(r);
        if(ch==ch1){
           count++;
           r++;
        }else{
        val=Math.max(val,count);
        count=0;
        l=r;
        }
      }  
      if(count!=0){
        val=Math.max(val,count);
      }
      return val;
    }
}