class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
          int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] == 1) {
                count ++;
            }
            else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        max = Math.max(max, count);
        return max;
        
        // int xor1 =0,xor2=0;
        // int n = nums.length-1;
        // for(int i=0;i<n;i++){
        //     xor2 = xor2^i;
        //     xor1=xor1^(i+1);
        // }
        // xor1 = xor1^nums.length;
        // return xor1^xor2;
    }
}