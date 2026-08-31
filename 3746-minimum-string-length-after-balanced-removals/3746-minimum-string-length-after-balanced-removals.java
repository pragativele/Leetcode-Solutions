class Solution {
    public int minLengthAfterRemovals(String s) {
        int Acount = 0;
        int Bcount = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a'){
                Acount++;
            }else{
                Bcount++;
            }
        }
        return Math.abs(Acount - Bcount);
    }
}