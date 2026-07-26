class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=left; i<=right; i++){
            int x = i;
            boolean flag = true;
            while( x > 0){
                int digit = x % 10;
                if( digit == 0 || i % digit != 0){
                    flag = false;
                    break;
                }
                x /= 10;
            }
            if( flag){
                ans.add(i);
            }
        }
        return ans;
    }
}