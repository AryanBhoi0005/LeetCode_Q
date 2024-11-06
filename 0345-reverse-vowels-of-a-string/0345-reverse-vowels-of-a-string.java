class Solution {
    public String reverseVowels(String s) {
    //    s=s.toLowerCase();
       StringBuilder sb=new StringBuilder();
       StringBuilder fi=new StringBuilder();
       for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E'||ch=='I'|| ch=='O' ||ch=='U'){
           sb.append(ch);
           }
       }
       sb.reverse();
       int j=0;
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E'||ch=='I'|| ch=='O' ||ch=='U'){
        fi.append(sb.charAt(j));
        j++;
        }else{
        fi.append(ch);
        }
       }
       String hey=fi.toString();
        return hey;
    }
}