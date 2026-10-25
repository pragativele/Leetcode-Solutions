class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> set = new HashSet<>();
        char c = ' ';
        for(char ch : s.toCharArray()){
            if(set.contains(ch)){
                c = ch;
                break;
            }
            set.add(ch);
        }
        return c;
    }
}