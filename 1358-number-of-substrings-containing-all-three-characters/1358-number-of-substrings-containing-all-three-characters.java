class Solution {
    public int numberOfSubstrings(String s) {
         int last[] = new int[]{-1,-1,-1}, ans = 0, n = s.length();
        for(int i = 0; i < n; i++) {
            last[s.charAt(i) - 'a'] = i;
            ans += Math.min(Math.min(last[0], last[1]), last[2]) + 1;
            // System.out.println(ans);
        }
        return ans;
    }
}