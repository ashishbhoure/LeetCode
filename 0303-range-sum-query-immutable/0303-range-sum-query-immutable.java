class NumArray {
    int[] res;
    int [] prefix;
    public NumArray(int[] nums) {
        this.res = nums;
        int n = nums.length;
        this.prefix = new int[n];
        prefixSum(nums);
    }
    
    public int sumRange(int left, int right) {
        return left-1 >= 0?prefix[right ] - prefix[left -1 ]:prefix[right];
    }
    
    private void prefixSum(int[] nums){
        for(int i=0;i<nums.length;i++){
            if (i == 0) {
                prefix[i] = nums[i];
            } else {
                prefix[i] = nums[i] + prefix[i - 1];
            }
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */