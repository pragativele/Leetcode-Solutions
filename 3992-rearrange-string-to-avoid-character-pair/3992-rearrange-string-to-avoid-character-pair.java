class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder ychar = new StringBuilder();
        StringBuilder other = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == y){
                ychar.append(ch);
            }else{
                other.append(ch);
            }
        }
        return ychar.append(other).toString();
    }
}