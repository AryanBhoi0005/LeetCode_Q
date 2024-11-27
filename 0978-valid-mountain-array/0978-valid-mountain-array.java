class Solution {
    public boolean validMountainArray(int[] arr) {
        
        if(arr.length<3){
            return false;
        }
    int i=0;
    while(i<arr.length-1){
      if(arr[i]>arr[i+1]){
         break;
      }
      else if(arr[i]==arr[i+1]){
        return false;
      }
      i++;
    }
    if(i==arr.length-1 || i==0){
        return false;
    }
    while(i<arr.length-1){
        if(arr[i+1]>=arr[i]){
           return false;
        }
        i++;
    }
return true;
    }
}