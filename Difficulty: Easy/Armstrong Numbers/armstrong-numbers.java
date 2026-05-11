// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        int ori =  n;
        int sum = 0;
        
        while(n!=0){
            int digit = n%10;
            sum += Math.pow(digit,3); 
            n /=10;
        }
        return sum == ori;
        
        // code here
        
    }
}