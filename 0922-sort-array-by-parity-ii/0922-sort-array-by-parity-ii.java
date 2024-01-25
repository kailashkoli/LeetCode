class Solution {
    public int[] sortArrayByParityII(int[] nums) {    int[] ans = new int[nums.length];
    int i=0;
    int j=1;
    int k=0;
    while(i<nums.length||j<nums.length){
        if(nums[k]%2==0){
            ans[i]=nums[k];
            i+=2;
        }else{
            ans[j]=nums[k];
            j+=2;
        }
        ++k;
    }
    return ans;
        
    }
}