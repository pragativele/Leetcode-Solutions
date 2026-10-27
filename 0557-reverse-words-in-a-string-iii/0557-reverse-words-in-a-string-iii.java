class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if( ch != ' '){
                word.append(ch);
            }else{
                ans.append(word.reverse()).append(" ");
                word.setLength(0);
            }
        }
        ans.append(word.reverse());
        return ans.toString();
    }
}