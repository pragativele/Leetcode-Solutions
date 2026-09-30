class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for(int i =0; i<apple.length; i++){
            sum += apple[i];
        }
        Arrays.sort(capacity);
        int res = 0;
        int count = 0;
        for(int i=capacity.length-1; i>=0; i--){
            res += capacity[i];
            count++;
            if(res >= sum){
                break;
            }
        }
        return count;
    }
}