class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int sum=0;
       while(x>0)
        {int k=x%10;
        sum=(sum*10)+k;
        x=x/10;}
        if(sum==temp){
            return true;
        }
        return false;
    }
}