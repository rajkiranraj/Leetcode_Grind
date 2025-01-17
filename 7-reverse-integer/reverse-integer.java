import java.util.*;
class Solution {
    int rev = 0;
    public int reverse(int n) {
       while(n!=0){
        int ld = n%10; 
        if(rev>Integer.MAX_VALUE/10 || Integer.MIN_VALUE/10>rev){
            return 0;
        }
        rev = rev*10+ld;
        n=n/10;
       }
      
        return rev;
    }
}