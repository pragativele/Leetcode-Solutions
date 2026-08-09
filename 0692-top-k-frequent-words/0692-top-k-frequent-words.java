class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();

        // Custom Comparator for Max-Heap:
        // 1. Sort by frequency descending.
        // 2. If frequencies match, sort by word ascending (alphabetical order).
        PriorityQueue<Map.Entry<String, Integer>> q = new PriorityQueue<>((a, b) -> {
            if(a.getValue().equals(b.getValue())){
                return a.getKey().compareTo(b.getKey()); //Alphabetical order (a to z)
            }
            return Integer.compare(b.getValue(), a.getValue()); // Descending frequency
        });

        
        for(String i : words){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        //add all ele into queue
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            q.offer(entry);
        }
        //extract only k ele
        ArrayList<String> ans = new ArrayList<>();
       for(int i=0; i<k; i++){
            Map.Entry<String, Integer> curr = q.poll();
            String str = curr.getKey();
            ans.add(str);
        }
        return ans;
    }
}