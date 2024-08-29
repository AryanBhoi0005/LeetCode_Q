class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int si=0;
    int ei=numbers.length-1;
    int arr[]=new int[2];
    while(si<ei){
    int sum=numbers[si]+numbers[ei];
    if( sum == target){
        arr[0]=si+1;
        arr[1]=ei+1;
        return arr;
    }
    else if(numbers[si]+numbers[ei] < target){
        si++;
    }
    else{
        ei--;
    }
    }
    return arr;
    }
}