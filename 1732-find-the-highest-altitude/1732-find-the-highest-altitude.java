class Solution {
    public int largestAltitude(int[] gain) {
        int total[] = new int[gain.length+1];
        int high = 0;
        for(int i=0; i<gain.length; i++){
            total[i+1] = total[i] + gain[i];
            high = Math.max(high, total[i+1]);
        }
        return high;
    }
}