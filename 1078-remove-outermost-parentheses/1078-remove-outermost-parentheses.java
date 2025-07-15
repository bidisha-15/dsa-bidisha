class Solution {
    public String removeOuterParentheses(String s) {
        int cntOpen=0;
        StringBuilder newstr=new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == '('){
                if(cntOpen>0)newstr.append(c);
                cntOpen++;
            }
            else if(c==')'){
                cntOpen--;
                if(cntOpen>0)newstr.append(c);
            }
        }
        return newstr.toString();
    }
}