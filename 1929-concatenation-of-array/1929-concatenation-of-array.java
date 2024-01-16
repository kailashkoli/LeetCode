class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int p=nums.length;
        int sum=n+p;
        int ans[]=new int[sum];
        int que[]=new int[n];
        int k=0 ;
        for(int i=0 ; i<n ; i++){
                ans[k++]=nums[i];
            }
        k=p;
        for(int i=0 ; i<n ; i++){
                ans[k++]=nums[i];
            }
        return ans;    
    }
}