class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean ans[] = new boolean[26];
        int count = 0;
        for(int i=0; i<sentence.length(); i++){
            char ch = sentence.charAt(i);
            if(ans[ch - 'a'] != true){
                ans[ch - 'a'] = true;
                count++;
            }
        }
        return count == 26;
    }
}