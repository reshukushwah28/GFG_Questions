// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // char arr[] = s.toCharArray();
        // String result = "";
        // for(int i = arr.length - 1 ; i>= 0; i--){
        //     result+=arr[i];
            
        // }
        // return result;  Brute force approach 
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length -1;
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}