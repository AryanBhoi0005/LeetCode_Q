class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
               sb.append(Character.toUpperCase(ch)); 
            }
        }

        StringBuilder str=new StringBuilder();
        int count=0;
        for(int i=sb.length()-1;i>=0;i--){
            char ch=sb.charAt(i);
            if(count==k){
                str.append('-');
                count=0;
            }
                str.append(ch);
                count++;
        
        }
        return str.reverse().toString();
    }
}