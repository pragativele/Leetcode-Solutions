class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;
        for(int i = num1; i<= num2; i++){
           int count = 0;
            
            String s = Integer.toString(i);
            for(int j = 1; j<s.length()-1; j++){
                char ch = s.charAt(j);
                if((ch > s.charAt(j-1) && ch > s.charAt(j+1)) ||
                (ch < s.charAt(j-1) && ch < s.charAt(j+1))){
                    count++;
                }
            }
            ans += count;
        }
        return ans;
    }
}