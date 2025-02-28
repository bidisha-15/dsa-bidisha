// class Solution {
//     public String convert(String s, int numRows) {
//         int i = 0;
//         char carr[] = s.toCharArray();
//         if (numRows == 1 ) {
//             return s;
//         }
//         String arr[] = new String[numRows];
//         while (i < s.length()) {
//             for (int idx = 0; idx < numRows && i < s.length(); idx++) {
//                 if(arr[idx]==null){
//                     arr[idx]="";
//                 }
//                 arr[idx] = arr[idx] + carr[i++];
//             }
//             for (int idx = numRows - 2; idx >= 1 && i < s.length(); idx--) {
//                 arr[idx] = arr[idx] + carr[i++];
//             }
//         }
//         for (i = 1; i < arr.length; i++) {
//             arr[0] = arr[0].concat(arr[i]);
//         }
//         return arr[0];
//     }
// }

class Solution {
    public String convert(String s, int nRows) {
    char[] c = s.toCharArray();
    int len = c.length;
    StringBuffer[] sb = new StringBuffer[nRows];
    for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();
    
    int i = 0;
    while (i < len) {
        for (int idx = 0; idx < nRows && i < len; idx++) // vertically down
            sb[idx].append(c[i++]);
        for (int idx = nRows-2; idx >= 1 && i < len; idx--) // obliquely up
            sb[idx].append(c[i++]);
    }
    for (int idx = 1; idx < sb.length; idx++)
        sb[0].append(sb[idx]);
    return sb[0].toString();
}
}