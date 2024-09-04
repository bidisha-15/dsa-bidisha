class Solution {
    public int reverse(int x) {
        int INT_MAX = Integer.MAX_VALUE;
        
        int sign = (x >= 0) ? 1 : -1;
        int n = Math.abs(x);
        int rev = 0;
        while (n != 0) {
            int d = n % 10;
            n /= 10;

            if (rev > (INT_MAX - d) / 10) {
                return 0;
            }

            rev = rev * 10 + d;
        }

        return sign * rev;
    }
    }
