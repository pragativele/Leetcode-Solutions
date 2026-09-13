class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int sum = Integer.MAX_VALUE;
        ArrayList<String> arr = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<list1.length; i++){
            map.put(list1[i], i);
        }
        for(int i=0; i<list2.length; i++){
            if(map.containsKey(list2[i])){
                int currsum = map.get(list2[i]) + i;
                if(currsum < sum){
                    sum =currsum;
                    arr.clear();
                    arr.add(list2[i]);
                }else if(currsum == sum){
                    arr.add(list2[i]);
                }
            }
        }
        return arr.toArray(new String[0]);
    }
}