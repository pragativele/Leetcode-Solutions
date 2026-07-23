class Solution {
    public int minimumDeletions(String s) {
        int deletion = 0;
        int bcnt = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'b'){
                bcnt++;
            }else if(s.charAt(i) == 'a'){
                deletion = Math.min(deletion + 1, bcnt);
            }
        }
        return deletion;
    }
}