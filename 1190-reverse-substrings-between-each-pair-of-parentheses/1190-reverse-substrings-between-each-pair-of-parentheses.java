class Solution {
   public String reverseParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(res.length());
            } else if (ch == ')') {
                int openParenIndex = stack.pop();
                reverseSubstring(res, openParenIndex, res.length() - 1);
            } else {
                res.append(ch);
            }
        }
        return res.toString();
    }
    
    private void reverseSubstring(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }
}