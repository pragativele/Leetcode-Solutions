class Solution {
    public int minPartitions(String n) {
        int maxval = 0;
        for(int i=0; i<n.length(); i++){
            if((n.charAt(i) - '0') > maxval){
                maxval = n.charAt(i) - '0';
            }
        }
        return maxval;
    }
}