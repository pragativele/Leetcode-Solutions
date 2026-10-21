class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums2.length; i++){
            set.add(nums2[i]);
        }
        int count1 = 0;
        for(int i=0; i<nums1.length; i++){
            if(set.contains(nums1[i])){
                count1++;
            }
        }
        set.clear();
        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }
        int count2 = 0;
        for(int i=0; i<nums2.length; i++){
            if(set.contains(nums2[i])){
                count2++;
            }
        }
        return new int[]{count1, count2};
    }
}