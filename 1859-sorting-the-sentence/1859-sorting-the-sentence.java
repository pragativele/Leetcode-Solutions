class Solution {
    public String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] ans = new String[str.length];
        StringBuilder sb = new StringBuilder();
        for(String word : str){
            int idx = word.charAt(word.length()-1) -'0' - 1;
            ans[idx] = word.substring(0, word.length()-1);
        }
        return String.join(" ", ans);
    }
}