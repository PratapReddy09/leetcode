class Solution {
    public boolean isPalindrome(int x) {
        
        int sum=0, m, i=0;
        int n=x;
       while(i<x){
            m=x%10;
            sum=sum*10+m;
            x=x/10;
           
        }
        return (sum==n)?true:false;
        
    }
}