class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxval = Integer.MIN_VALUE;
        for(int i=0; i<candies.length; i++){
            maxval = Math.max(maxval, candies[i]);
        }
        ArrayList<Boolean> list = new ArrayList<>();
        for(int i=0; i<candies.length; i++){
            if((candies[i] + extraCandies) >= maxval ){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}