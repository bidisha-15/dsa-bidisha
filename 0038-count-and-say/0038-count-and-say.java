class Solution {
    public String countAndSay(int n) {
        String s="1";
        for(int i=1;i<n;i++){
            s=counter(s);
        }
        return s;
    }

    String counter(String str){
        StringBuilder sb=new StringBuilder();
        char prev=str.charAt(0);
        int cnt=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==prev){
                cnt++;
            }
            else{
                sb.append(cnt);
                sb.append(prev);
                prev=str.charAt(i);
                cnt=1;
            }
        }
        sb.append(cnt);
        sb.append(prev);
        return sb.toString();
    }
}