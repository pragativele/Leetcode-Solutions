class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //count freq
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        //store in primit arr so that comparator can be used
        Integer[] arr = new Integer[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i] = nums[i];
        }
        Arrays.sort(arr, (a, b) -> {
            int freqA = map.get(a);
            int freqB = map.get(b);

            //freq is not equal min freq ele store 1st
            if(freqA != freqB){
                return freqA- freqB;
            }
            //if freq is equal store through val
            return b-a;
        });
        //store in int[]
        for(int i=0; i<nums.length; i++){
            nums[i] = arr[i];
        }
        return nums;
    }
}