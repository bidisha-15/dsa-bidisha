class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        char str[]=s.toCharArray();
        int sign=1;
        int i=0;
        if(str[i]=='-'){
            sign=-1;
            i++;
        }
        else if (s.charAt(i)=='+') {
            i++;
        }

        long result=0;
        while (i<s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i)-'0';
            result = result*10+ digit;
            if (result*sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (result*sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int) result*sign;
    }
}