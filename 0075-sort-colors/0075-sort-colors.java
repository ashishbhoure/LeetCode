class Solution {
    public void sortColors(int[] nums) {
        
//         Dutch national flag algorithum
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        
        while(mid<=high){
            if(nums[mid] == 0 ){
                int temp = nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                // swap(nums[low],nums[mid]);
                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                // swap(nums[mid],nums[high]);
                high--;
            }
        }
    }
    
    // public static void swap(int a, int b){
    //     int temp = a;
    //     a=b;
    //     b=temp;
    // }
}