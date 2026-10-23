class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set1 = new HashSet<>();
        for(int n: nums1){
            set1.add(n);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(int n: nums2){
            set2.add(n);
        }
        HashSet<Integer> set3 = new HashSet<>();
        for(int n: nums3){
            set3.add(n);
        }
        for(int i: set1){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(int i: set2){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(int i: set3){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() >= 2){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}