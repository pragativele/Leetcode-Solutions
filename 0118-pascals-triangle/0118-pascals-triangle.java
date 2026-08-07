class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            ArrayList<Integer> curr = new ArrayList<>();
            
            for(int j =0; j<=i; j++){
                if(j==0 || j==i){
                    curr.add(1);
                }else{
                    List<Integer> prevRow = ans.get(i-1);
                    curr.add(prevRow.get(j-1) + prevRow.get(j));
                }
            }
            ans.add(curr);
        }
        return ans;
    }
}