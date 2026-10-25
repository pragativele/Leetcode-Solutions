class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(char ch : word1.toCharArray()){
            map1.put(ch, map1.getOrDefault(ch, 0) +1);
        }
        for(char ch : word2.toCharArray()){
            map2.put(ch, map2.getOrDefault(ch, 0) +1);
        }
        for(char ch : map1.keySet()){
            int freq1 = map1.get(ch);
            int freq2 = map2.getOrDefault(ch, 0);
            if(Math.abs(freq1 - freq2) > 3){
                return false;
            }
        }
        for(char ch : map2.keySet()){
            int freq1 = map1.getOrDefault(ch, 0);
            int freq2 = map2.get(ch);
            if(Math.abs(freq1 - freq2) > 3){
                return false;
            }
        }
        return true;
    }
}