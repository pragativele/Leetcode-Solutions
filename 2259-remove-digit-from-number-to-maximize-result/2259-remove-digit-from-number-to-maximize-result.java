class Solution {
    public String removeDigit(String number, char digit) {
        for(int i=0; i<number.length(); i++){
            if(number.charAt(i) == digit && i+1 < number.length() && number.charAt(i+1) > digit){
                number = number.substring(0, i) + number.substring(i+1);
                return number;
            }
        }
        for(int i=number.length()-1; i>=0; i--){
            if(number.charAt(i) == digit){
                number = number.substring(0, i) + number.substring(i+1);
                return number;
            }
        }
        return number;
    }
}