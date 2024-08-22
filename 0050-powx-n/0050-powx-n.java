class Solution {
    public double myPow(double x, int n) {
        double ans=1;
        long m=Math.abs((long)n);
        while(m>0){
            if(m%2!=0){
               ans*=x;
               m=m-1;
            }
            else{
                m=m/2;
                x=x*x;
            }
        }
        if(n<0){
            double neg=1.0/ans;
            return neg;
        }
        return ans;
    }
}