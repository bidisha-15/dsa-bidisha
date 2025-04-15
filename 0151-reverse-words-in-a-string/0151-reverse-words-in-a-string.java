class Solution {
    public String reverseWords(String s) {
        s=s.replaceAll("\\s{2,}", " ").trim();
        String[] myArray = s.split(" ");
        String res="";
    for (int i=myArray.length-1;i>=0;i--) {
        if(i!=0){
        res=res+myArray[i]+" ";
        }
        else{
        res=res+myArray[i];
        }
    }
    return res;
    }
}