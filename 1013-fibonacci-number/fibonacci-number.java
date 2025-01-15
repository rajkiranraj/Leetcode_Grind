class Solution {
  
    public int fib(int n) {
      int term1 = 0;int nextTerm = 0;
      int term2 = 1;
      for(int i = 0;i<n;i++){
        nextTerm = term1+term2;
        term1 = term2;
        term2 = nextTerm;
      }  
      return term1;
    }  
}