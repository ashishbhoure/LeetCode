class Solution {
    public int maxDistance(int[] position, int m) {
        int n = position.length;
        Arrays.sort(position);
        
        int minF = 1;
        int maxF = (position[n-1] - position[0])/(m-1);
        
        int result = 0;
        while(minF <= maxF){
            int mid = minF + (maxF -minF)/2;
            
            if(posibaleToPlace(mid,position,m)){
                result = mid;
                minF = mid+1;
            }else{
                maxF = mid -1;
            }
        }
        
        return result;
    }
    
    boolean posibaleToPlace(int force, int[] position, int m){
        int prev = position[0];
        int count = 1;
        
        for(int i=1;i<position.length;i++){
            int curr = position[i];
            
            if(curr - prev >= force){
                count++;
                prev = curr;
            }
            if(count == m){
                break;
            }
        }
        
        return count == m;
    }
}