class Solution {
    public long minimumSteps(String s) {
    int n=s.length();
    int zero=0;
    long swaps=0;

    for(int i=n-1;i>=0;i--){
        if(s.charAt(i)=='0'){
           zero++;
        }else{
            swaps+=zero;
        }
    }  
    return swaps;
    }
}