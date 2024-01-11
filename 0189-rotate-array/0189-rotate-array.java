class Solution {
 	
	public int[] reverse(int []A,int start,int end) {
		int temp;
		for(int i=start,j=end-1;i<j;i++,j--) {
			temp=A[i];
			A[i]=A[j];
			A[j]=temp;
		}
		
		return A;
	}
    public void rotate(int[] nums, int k) {
      if(k>nums.length)
    	{
    		k=k%nums.length;
    	}
    	nums=reverse(nums,0,nums.length);

    	nums=reverse(nums,0,k);
 
    	nums=reverse(nums,k,nums.length);

    }
}