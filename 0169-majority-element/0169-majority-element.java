class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int element = -1;
        //checking for the majority element in the array
        for(int i=0; i<nums.length; i++){
            //initially count==0 hence for i=0, it goes into this check
            //if then count decrements and becomes 0, then it again comes over this check 
            if(count==0){
                element = nums[i];
                count =1;
            }
            else{
                    if(nums[i]== element){
                        count++;
                    } else{
                        count--;
                    }
            }
        }
        //checking if the candidate we have in majority has frequency over n/2
        count =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]== element){
                count ++;
            }
        }
        if(count>nums.length/2){
            return element;
        }
        return -1;
    }
}