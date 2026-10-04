class Solution {
    public int findTheWinner(int n, int k) {
        //if 1 person in arr he will win
        //0-indexed array is used(if 1 person is in arr hw will present at idx 0)
        int win = 0;
        //i=2 coz when 1 person is in arr we handled it at start, now we check for 2 person arr
        for(int i=2; i<=n; i++){
            win = (win + k) % i;
        }
        return win+1;
    }
}