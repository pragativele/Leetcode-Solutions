class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<words.length; i++){
            int sum =0;
            String str = words[i];
            for(int j=0; j<str.length(); j++){
                sum += weights[str.charAt(j)-'a'];
            }
            sb.append((char) ('z' - (sum % 26)));
        }
        return sb.toString();
    }
}