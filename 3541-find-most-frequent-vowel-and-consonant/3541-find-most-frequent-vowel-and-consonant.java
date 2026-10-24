class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) +1);
        }
        int maxV = 0;
        int maxC = 0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            char ch = entry.getKey();
            int freq = entry.getValue();
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                maxV = Math.max(maxV, freq);
            }else{
                maxC = Math.max(maxC, freq);
            }
        }
        return maxV + maxC;
    }
}