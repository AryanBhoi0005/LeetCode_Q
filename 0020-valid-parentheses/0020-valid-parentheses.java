class Solution {
    public boolean isValid(String s) {
        Stack<Character> build=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                build.push(ch);
            }
            else{
                if(build.isEmpty()){
                   return false;
                }
                else if((build.peek()=='{' && ch=='}') || (build.peek()=='(' && ch==')') || (build.peek()=='[' && ch==']')){
                 build.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(build.isEmpty()){
            return true;
        }
        return false;
    }
}