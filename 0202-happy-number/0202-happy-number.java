class Solution {
    public static int sq(int n){
        int num=0;
        while(n>0){
        int temp=n%10;
        n=n/10;
        int val=temp*temp;
        num=num+val;
        }
        return num;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();

        while(n!=1 && !set.contains(n)){
            set.add(n);
            n=sq(n);
        }
    return n==1;
    }
}