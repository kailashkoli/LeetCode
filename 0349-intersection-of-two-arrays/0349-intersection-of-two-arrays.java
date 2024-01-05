class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for( int i=0 ; i<nums1.length ; i++ )
        {
            set1.add(nums1[i]);
        }
        for( int i=0 ; i<nums2.length ; i++ )
        {
            if( set1.contains(nums2[i]) && !set2.contains(nums2[i]) )
            {
                set2.add(nums2[i]);
                list.add(nums2[i]);
            }
        }
        int arr[]=new int[list.size()];
        for( int i=0 ; i<list.size() ; i++ )
        {
            arr[i]=list.get(i);
        } return arr;
    }
}