class Solution {
    public void sort012(int[] arr) {
        //dutch flag algo 
        int l = 0;
        int r = arr.length-1;
        int mid = 0;
        while(mid<= r){
            if(arr[mid] == 0){
                int temp = arr[l];
                arr[l] = arr[mid];
                arr[mid] = temp;
                l++;
                mid++;
            }
            else if (arr[mid] == 1){
                mid++;
            }
            else {
                int temp = arr[mid];
                arr[mid] = arr[r];
                arr[r] =  temp;
                r--;
            }
        }
        
    }
}