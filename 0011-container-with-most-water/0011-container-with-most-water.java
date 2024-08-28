class Solution {
    public int maxArea(int[] height) {
        int si=0;
        int ei=height.length-1;
        int Vol=0;
        int CurrWater=0;
        int wid=0;
        while(si<ei){
        wid=ei-si;
        CurrWater=wid*Math.min(height[si],height[ei]);
        Vol=Math.max(CurrWater,Vol);
        if(height[si]<height[ei]){
            si++;
        }
        else{
            ei--;
        }
        }
        return Vol;
    }
}