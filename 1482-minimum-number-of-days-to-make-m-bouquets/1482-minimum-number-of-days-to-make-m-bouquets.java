class Solution {
    
//     public static int findMin(int[] arr){
//         int min = Integer.MAX_VALUE;
//         for(int i=0;i<arr.length;i++){
//             min = Math.min(min,arr[i]);
//         }
//         return min;
//     }
    
//      public static int findMax(int[] arr){
//         int max = Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             max = Math.max(min,arr[i]);
//         }
//         return max;
//     }
    
    public static boolean possible(int[] arr, int day, int m, int k) {
        int n = arr.length; // Size of the array
        int cnt = 0;
        int noOfB = 0;
        // Count the number of bouquets:
        for (int i = 0; i < n; i++) {
            if (arr[i] <= day) {
                cnt++;
            } else {
                noOfB += (cnt / k);
                cnt = 0;
            }
        }
        noOfB += (cnt / k);
        return noOfB >= m;
    }
    
    public int minDays(int[] arr, int m, int k) {
        if(arr.length < ((long)m*(long)k)){
            return -1;
        }
        
        
        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            mini = Math.min(mini, arr[i]);
            maxi = Math.max(maxi, arr[i]);
        }
        
        int low= mini ;
        int high = maxi;
        
        while(low <= high){
            int mid = (low + high) / 2;
            if (possible(arr, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}