class Solution {
    public boolean squareIsWhite(String coordinates) {
        int num1 = coordinates.charAt(0) - 'A' + 1;
        int num2 = coordinates.charAt(1) - '0';
        if((num1 + num2) % 2 == 0){
            return false;
        }
        return true;
    }
}