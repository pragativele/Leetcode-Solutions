class Solution {
    public boolean lemonadeChange(int[] bills) {
        int tencount = 0;
        int fivecount = 0;
        for(int bill : bills){
            if(bill == 5){
                fivecount++;
            }else if(bill == 10){
                if(fivecount <= 0){
                    return false;
                }
                fivecount--;
                tencount++;
            }else if(bill == 20){
                if(fivecount> 0 && tencount > 0){
                    tencount--;
                    fivecount--;
                }else if(fivecount >= 3){
                    fivecount -= 3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}