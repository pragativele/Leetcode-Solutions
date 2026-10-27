class Solution {
    public String firstPalindrome(String[] words) {
        String ans;
        for(int i=0; i<words.length; i++){
            String str = new StringBuilder(words[i]).reverse().toString();
            if(words[i].equals(str)){
                return words[i];
            }
        }
        return "";
    }
}