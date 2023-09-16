class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int i = arr1.length;
        int j = arr2.length;
 
        int[] arr = new int[i + j];
 
        // Merge two array into one array
        System.arraycopy(arr1, 0, arr, 0, i);
        System.arraycopy(arr2, 0, arr, i, j);
 
        // Sort the merged array
        Arrays.sort(arr);
        
        int n = arr.length;
 
        // If length of array is even
        if (n % 2 == 0) {
            int z = n / 2;
            int e = arr[z];
            int q = arr[z - 1];
            double ans = (e+q) / 2.0;
            
            return (double) ans;
        }
 
        // If length if array is odd
        else {
            int z = (n / 2);
            return (double) arr[z];
        }
    }
}