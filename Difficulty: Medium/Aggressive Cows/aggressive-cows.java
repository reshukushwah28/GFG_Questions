class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        int n = stalls.length;
        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[n-1]- stalls[0];
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(canPlace(stalls,k , mid)){
                ans = mid;
                low = mid+1;
            }
            else{
            high = mid-1;
            }
        }
        return ans;
        
    }
    public boolean canPlace(int[]stalls , int k , int mid){
        int count = 1;
        int last = stalls[0];
        for(int i =0 ; i< stalls.length ;i++){
            int diff = stalls[i] - last;
            if(diff >= mid){
                count++;
                last = stalls[i];
            }
            if(count>= k){
                return true;
            }
            
        }
        return false;
    }
}