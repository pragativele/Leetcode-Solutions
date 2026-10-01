class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int dis = Integer.MAX_VALUE;
        for(int i=0; i<arr.length-1; i++){
            dis = Math.min(dis, arr[i+1] - arr[i]);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1] - arr[i] == dis){
                ans.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }
        return ans;
    }
}