class Solution {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;

        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                result[index++] = nums1[i];
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        // Resize the result array if needed
        return Arrays.copyOf(result, index);

        
    }
    public static void main(String[] args){
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};

        int[] result = intersect(num1,num2);
        System.out.println("Intersection is : "+ result);
    }
}