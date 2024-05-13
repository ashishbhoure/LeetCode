class Solution {
    
//     public long strToNum(String num){
//         long n = 0L;
//         for(int i =0;i<num.length();i++){
//             int x = num.charAt(i)-'0';
//             n = (n*10)+x;
//         }
//         return n;
//     }
    
//     public String multiply(String num1, String num2) {
//         long n1 = strToNum(num1);
//         long n2 = strToNum(num2);
//         return (n1*n2)+"";
//     }
    
    public String multiply(String num1, String num2) {
        final int m = num1.length();
        final int n = num2.length();

        StringBuilder sb = new StringBuilder();
        int[] pos = new int[m + n];

        for (int i = m - 1; i   >= 0; --i)
          for (int j = n - 1; j >= 0; --j) {
            final int multiply = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            final int sum = multiply + pos[i + j + 1];
            pos[i + j] += sum / 10;
            pos[i + j + 1] = sum % 10;
          }

        for (final int p : pos)
          if (p > 0 || sb.length() > 0)
            sb.append(p);

        return sb.length() == 0 ? "0" : sb.toString();
    }
}