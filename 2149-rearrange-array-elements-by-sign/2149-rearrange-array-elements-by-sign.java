class Solution {
    public int[] rearrangeArray(int[] nums) {
        int arr[]=new int[nums.length];
        int end=1 , strt=0 ;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]<0){
                arr[end]=nums[i];
                end+=2;
            }
            else{
                arr[strt]=nums[i];
                strt+=2;
            }
        }
        return arr;
    }
}