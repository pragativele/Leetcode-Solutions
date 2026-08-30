class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int start = 0;
        int end = 0;
        int i= lower;
        while(i<= upper){
            if(set.contains(i)){
                i++;
                continue;
            }
            start = i;
            while(i<= upper && (!set.contains(i))){
                i++;
            }
            end = i - 1;
            ans.add(new ArrayList<>(Arrays.asList(start, end)));
        }
        return ans;
    }
}