class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        Arrays.sort(arr);
        int maxi = arr[arr.length-1];
        int mini = arr[0];
        ArrayList<Integer> res = new ArrayList<>();
        res.add(mini);
        res.add(maxi);
        return res;
        
        
        // code Here
        
    }
}
