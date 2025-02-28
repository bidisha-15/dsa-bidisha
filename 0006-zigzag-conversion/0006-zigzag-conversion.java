class Solution {
    public String convert(String s, int numRows) {
        int x = 1, f = 0;
        int arr[] = new int[s.length()];
        if(numRows==1){
               return s;}
        for (int i = 0; i < arr.length; i++) {
        
            
            if (x == numRows) {
                f = 1;
            }
            else if(x==1){
                f=0;
            }
            arr[i] = x;
            if (f == 0) {
                x++;
            } else {
                x--;
            }
        }
        String res="";
        for(int i=1;i<=numRows;i++){
            for(int j=0;j<arr.length;j++){
                if(i==arr[j]){
                    res=res+s.charAt(j);
                }
            }
        }
        return res;
    }
}
