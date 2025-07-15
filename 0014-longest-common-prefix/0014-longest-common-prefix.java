class Solution {
    public String longestCommonPrefix(String[] strs) {
    if(strs.length==0){
        return "";
    }
      Arrays.sort(strs);
      StringBuilder newstr=new StringBuilder();
      
      String first=strs[0]; String last=strs[strs.length-1];
    for(int i=0; i<first.length();i++){
        if(first.charAt(i)!=last.charAt(i)){
            break;
        }
        else{
            newstr.append(first.charAt(i));
        }
    }
    return newstr.toString();
    }
}