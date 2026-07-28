class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int ans = 0;
        int place = 1;
        int digit1 =0, digit2=0, digit3=0;
        for(int i=1; i<=4; i++){
             digit1 = num1 % 10;
             digit2 = num2 % 10;
             digit3 = num3 % 10;
            ans += place *(Math.min(digit1, Math.min(digit2, digit3)));
            place *= 10;
            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
        }
        return ans;
    }
}