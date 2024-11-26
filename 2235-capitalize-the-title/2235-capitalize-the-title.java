class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder list=new StringBuilder();
        String arr[]=title.split(" ");
        int i=0;
        for(String key:arr){
            int n=key.length();
            if(n<=2){
               list.append(key.toLowerCase());
              if(i<arr.length-1){
               list.append(" "); 
               }
            }
            else{
                list.append(Character.toUpperCase(key.charAt(0)));
                list.append(key.substring(1).toLowerCase());
               if(i<arr.length-1){
               list.append(" "); 
               }
            }
            i++;
        }
        return list.toString();
    }
}