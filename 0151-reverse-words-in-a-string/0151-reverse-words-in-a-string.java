class Solution {
    public String reverseWords(String s) {
        s=s.replaceAll("\\s{2,}", " ").trim();
        String[] myArray = s.split(" ");
        String res="";
    for (int i=myArray.length-1;i>=0;i--) {
        if(!myArray[i].trim().equals(" ")){
        res=res+myArray[i].trim()+" ";}
        System.out.println(myArray[i]);
    }
    res=res.trim();
    return res;
    }
}