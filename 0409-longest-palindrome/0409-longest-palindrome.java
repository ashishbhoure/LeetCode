class Solution {
    public int longestPalindrome(String s) {
        
        HashMap<Character , Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
           map.put(ch, map.getOrDefault(ch,0)+1);
        }
        
        int res =0;
        
        boolean oddFreq = false;
        
        for(int freq : map.values()){
            if((freq %2) ==0){
                res += freq;
            }else{
                res+=freq-1;
                oddFreq = true;
            }   
        }
        
        if(oddFreq) return res+1;
        
        return res;
    }
}