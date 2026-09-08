class Solution {
    public long minSub(int nums[]){
        long sum = 0;
        int n = nums.length;
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<=nums.length; i++){
            while(!s.isEmpty() && (i == n || nums[i] <= nums[s.peek()])){
                int mid = s.pop();

                int left = s.isEmpty() ? -1 : s.peek();
                int right = i;
                int leftChoice = mid - left;
                int rightChoice = right - mid;

                sum += (long) nums[mid] * leftChoice * rightChoice;
            }
            s.push(i);
        }
        return sum;
    }
    public long maxSub(int nums[]){
        long sum = 0;
        int n = nums.length;
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<=nums.length; i++){
            while(!s.isEmpty() && (i == n || nums[i] >= nums[s.peek()])){
                int mid = s.pop();
                int left = s.isEmpty() ? -1 : s.peek();
                int right = i;
                int leftChoice = mid - left;
                int rightChoice = right - mid;

                sum += (long) nums[mid] * leftChoice * rightChoice;
            }
            s.push(i);
        }
        return sum;
    }
    public long subArrayRanges(int[] nums) {
        return maxSub(nums) - minSub(nums);
    }
}