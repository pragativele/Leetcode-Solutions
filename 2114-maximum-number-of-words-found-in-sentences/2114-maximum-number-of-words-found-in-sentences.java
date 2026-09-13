class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<sentences.length; i++){
            int count = 0;
            for(char ch : sentences[i].toCharArray()){
                if(ch == ' '){
                    count++;
                }
            }
            ans = Math.max(count+1, ans);
        }
        return ans;
    }
}