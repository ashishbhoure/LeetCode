class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
         int x = 0, y = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] <= nums[i + 1])
                x++;
            else
                y++;
        }
        
        if(x==n-1 && y==0){
            return true;
        }
  
        if (y == 1) {
            if (nums[n - 1] <= nums[0])
                x++;
            else
                y++;
  
            if (y == 1)
                return true;
        }
        return false;
    }
}