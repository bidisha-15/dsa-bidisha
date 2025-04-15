class Solution {
    public String reverseWords(String s) {
        s=s.replaceAll("\\s{2,}", " ").trim();
        String[] myArray = s.split(" ");
        String res="";
    for (int i=myArray.length-1;i>=0;i--) {
        res=res+myArray[i].trim()+" ";
    }
    res=res.trim();
    return res;
    }
}