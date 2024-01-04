class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int temp;
        int k=0;
        int ans[]=new int[n];
        while(left<right){
            if(nums[left]%2!=0&&nums[right]%2==0){
                temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
            }
            if(nums[left]%2==0){
                left++;

            }
            if(nums[right]%2!=0){
                right--;
            }
        }
        return nums;
        
    }
}