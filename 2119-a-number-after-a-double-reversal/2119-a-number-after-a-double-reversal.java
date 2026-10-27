class Solution {
    public boolean isSameAfterReversals(int num) {
        return num == 0 || num % 10 != 0;
        // if(num == 0){
        //     return true;
        // }
        // if(num % 10 == 0){
        //     return false;
        // }
        // return true;
    }
}