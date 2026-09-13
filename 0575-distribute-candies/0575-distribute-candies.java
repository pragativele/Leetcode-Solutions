class Solution {
    public int distributeCandies(int[] candyType) {
        int eat = candyType.length / 2;
        HashSet<Integer> set = new HashSet<>();
        for(int candy : candyType){
            set.add(candy);
        }
        if(set.size() == eat){
            return eat;
        }else if(eat < set.size()){
            return eat;
        }else {
            return set.size();
        }
    }
}