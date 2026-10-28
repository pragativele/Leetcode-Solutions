class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int idx;
        if(ruleKey.equals("type")){
            idx = 0;
        }else if(ruleKey.equals("color")){
            idx = 1;
        }else{
            idx = 2;
        }
        int ans = 0;
        for(int i=0; i<items.size(); i++){
            List<String> curr = items.get(i);
            if(curr.get(idx).equals(ruleValue)){
                ans++;
            }
        }
        return ans;
    }
}