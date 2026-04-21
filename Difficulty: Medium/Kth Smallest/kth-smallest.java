class Solution {
    public int kthSmallest(int[] arr, int k) {
    //     // Code here
    //     int n = arr.length;
    //     Arrays.sort(arr);
    //     return arr[k-1];
    // PriorityQueue<Integer> pq = new PriorityQueue<>();
    // for( int num : arr){
    //     pq.add(num);
        
    // }
    // for(int i =0;i< k -1;i++){
    //     pq.poll();
        
    // }
    // return pq.peek();
    //using quick sort for pivot element
    
    int l = 0;
    int n = arr.length;
    int r = n-1;
    while(true){
        int piv = partition(arr, l , r);
        if( piv  == k - 1){
            return arr[piv];
            
        }else if (piv > k -1){
            r = piv -1;
        }
        else l = piv+1;
    }
    }
    private int partition(int []arr , int l , int r){
        int piv = arr[r];
        int  i = l;
        for( int j = l ; j < r ;j++){
            if(arr[j] <= piv){
                int temp = arr[i];
                arr[i]  = arr[j];
                arr[j] = temp;
                i++;
                
            }
            
        }
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;
        return i ;
    }
}
