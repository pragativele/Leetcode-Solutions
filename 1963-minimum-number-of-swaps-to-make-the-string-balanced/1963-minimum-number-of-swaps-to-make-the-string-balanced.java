class Solution {
    public int minSwaps(String s) {
        int open = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '['){
                open++;
            }else{ //"]" bracket
                if(open > 0){ // check in prev string is there any opening bracket or not
                    open--; //if ye...cancel out the swap
                }
            }
        }
        return (open + 1) / 2; //for 2 open brackets 1 swap requires for odd count + 1/2 required
    }
}