class Solution {
    public int countPairs(int[] nums, int k) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int count =0;
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                List<Integer> idx = map.get(nums[i]);
                for(int j: idx){
                    if((j * i) % k == 0){
                        count++;
                    }
                }
            }
           if(!map.containsKey(nums[i])){
            map.put(nums[i], new ArrayList<>());
           }
            map.get(nums[i]).add(i);
        
        }
        return count;
    }
}