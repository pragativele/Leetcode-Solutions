class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Character, Integer>> q = new PriorityQueue<>((a, b) -> (b.getValue()- a.getValue()));
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            q.offer(entry);
        }
        StringBuilder str = new StringBuilder();
        while(!q.isEmpty()){
            Map.Entry<Character, Integer> curr = q.poll();
            char ch = curr.getKey();
            int freq = curr.getValue();
            for(int i=0; i<freq; i++){
                str.append(ch);
            }
        }
        return str.toString();
    }
}