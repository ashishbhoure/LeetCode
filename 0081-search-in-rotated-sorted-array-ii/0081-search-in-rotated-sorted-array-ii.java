class Solution {
    public boolean search(int[] arr, int target) {
         int l = 0;
        int r = arr.length-1;
        
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==target){
                return true;
            }
            
            if(arr[l] == arr[mid] && arr[mid] == arr[r]){
                l++;
                r--;
                continue;
            }
            
            if(arr[l] <= arr[mid]){
                if(arr[l] <= target && target <= arr[mid]){
                    r = mid-1;
                }else{
                    l=mid+1;
                }
            }else{
                if(arr[mid] <= target && target <= arr[r]){
                    l = mid+1;
                    
                }else{
                    r=mid-1;
                }
            }
            
        }
        return false;
    }
}