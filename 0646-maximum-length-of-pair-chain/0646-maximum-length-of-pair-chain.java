class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,Comparator.comparing(a->a[1]));
        int end=pairs[0][1];
        int len=1;
        for(int i=1;i<pairs.length;i++){
            int start=pairs[i][0];
            if(end<start){
               len=len+1;
               end=pairs[i][1];
            }
        }
        return len;
    }
}