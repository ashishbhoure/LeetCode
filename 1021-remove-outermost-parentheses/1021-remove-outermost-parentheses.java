class Solution {
    public String removeOuterParentheses(String S) {
        // char[] arr = S.toCharArray();
        // int s = 0;
        // List<Integer> indexs = new ArrayList<>();
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == '(') {
        //         s++;
        //     } else if (arr[i] == ')') {
        //         s--;
        //     }
        //     if (indexs.size() % 2 == 0 && s == 1) {
        //         indexs.add(i + 1);
        //     } else if (indexs.size() % 2 != 0 && s == 0) {
        //         indexs.add(i);
        //     }
        // }
        // String res = "";
        // for (int i = 0; i < indexs.size(); i += 2) {
        //     res += S.substring(indexs.get(i), indexs.get(i + 1));
        // }
        // return res;
        
        
        StringBuilder s = new StringBuilder();
        int opened = 0;
        for (char c : S.toCharArray()) {
            if (c == '(' && opened++ > 0) s.append(c);
            if (c == ')' && opened-- > 1) s.append(c);
        }
        return s.toString();
    }
}