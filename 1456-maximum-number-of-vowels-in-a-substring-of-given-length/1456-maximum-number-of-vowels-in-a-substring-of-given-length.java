class Solution {
    public int maxVowels(String s, int k) {
        int maxCount =0;
        int windowVowel = 0;
        
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');vowels.add('e');vowels.add('i');vowels.add('o');vowels.add('u');
        
        for(int i=0;i<k;i++){
            if(vowels.contains(s.charAt(i))){
                windowVowel++;
            }
        }
        
        maxCount = windowVowel;
        
        for(int i=k;i<s.length();i++){
            if(vowels.contains(s.charAt(i-k))){
                windowVowel--;
            }
            
             if(vowels.contains(s.charAt(i))){
                windowVowel++;
            }
            
            maxCount = Math.max(maxCount , windowVowel);
            
        }
        
        return maxCount;
    }
}