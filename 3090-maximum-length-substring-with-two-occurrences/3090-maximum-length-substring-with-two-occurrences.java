class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int j = 0;
        int ans = 0;
        for(int i =0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) +1);
            while(map.get(s.charAt(i)) > 2){
                map.put(s.charAt(j), map.get(s.charAt(j)) -1);
                j++;
            }
            ans = Math.max(ans, i - j + 1);
        }
        return ans;
    }
}