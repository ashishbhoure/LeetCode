class Solution {
    public int helper(int[] nums, int k, int n) {
        int ans = 0;
        for(int i = 0, j = 0; j < n; j++) {
            if(nums[j] % 2 == 1) {
                k--;
            }
            while(k < 0) {
                if(nums[i] % 2 == 1) {
                    k++;
                }
                i++;
            }
            ans += j - i + 1;
        }
        return ans;
    }
    
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        return helper(nums,k,n) - helper(nums,k-1,n);
    }
}