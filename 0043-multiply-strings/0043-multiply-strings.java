class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";

        int[] product = new int[num1.length() + num2.length()];

        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
             
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');

                int p1 = i + j, p2 = i + j + 1; 
                int sum = mul + product[p2];

                product[p2] = sum % 10; 
                product[p1] += sum / 10; 
            }
        }
     
        StringBuilder result = new StringBuilder();
        for (int num : product) {
           
            if (!(result.length() == 0 && num == 0)) {
                result.append(num);
            }
        }

        return result.length() == 0 ? "0" : result.toString();
    }
}
