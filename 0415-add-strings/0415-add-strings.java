class Solution {
    public String addStrings(String num1, String num2) {
        int p1=num1.length()-1;
        int p2=num2.length()-1;
        int carry=0;
        int ans=0;
        StringBuilder sb=new StringBuilder();
        while(p1>=0 || p2>=0 ||carry>0){
        int x=p1>=0?num1.charAt(p1)-'0':0;
        int y=p2>=0?num2.charAt(p2)-'0':0;
        int total=x+y+carry;
        sb.append(total%10);
        carry=total/10;
        p1--;
        p2--;;
        }
        sb=sb.reverse();
        return sb.toString(); 
    }
}