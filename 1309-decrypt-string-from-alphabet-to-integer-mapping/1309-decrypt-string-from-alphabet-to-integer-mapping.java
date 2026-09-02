class Solution {
    public String freqAlphabets(String s) {
        String str ="";
        for(int i=0; i<s.length(); i++){
            if(i+2 < s.length() && s.charAt(i+2) == '#'){
                int num = Integer.parseInt(s.substring(i, i+2));
                str += (char)('a' + num-1);
                i += 2;
            }else{
                int num = Integer.parseInt(s.substring(i, i+1));
                str += (char)('a' + num-1);
            }
        }
        return str;
    }
}