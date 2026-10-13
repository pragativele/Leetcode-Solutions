class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        list.sort(Collections.reverseOrder());
        int n = Math.min(k ,list.size());
        int ans[] = new int[n];
        for(int i=0; i<n; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}