class Solution {
    public String predictPartyVictory(String senate) {
        //circular queue
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        int n = senate.length();
        for(int i=0; i<n; i++){
            if(senate.charAt(i) == 'R'){
                radiant.add(i);
            }else{
                dire.add(i);
            }
        }
        while(!radiant.isEmpty() && !dire.isEmpty()){
            int r = radiant.remove();
            int d = dire.remove();
            //check which senator comes 1st, then that senator can ban next one
            if(r < d){
                // here r+n uses coz if r comes 1st it can ban next one and still present in queue as men in Q(circular queue) so r came last in queue after all existing ele 
                radiant.add(r + n);
            }else{
                dire.add(d + n);
            }
        }
        if(radiant.isEmpty()){
            return "Dire";
        }else{
            return "Radiant";
        }
    }
}