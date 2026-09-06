class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<asteroids.length; i++){
             boolean alive = true;
            while(!s.isEmpty() && s.peek() > 0 && asteroids[i] < 0){
                if(s.peek() < -asteroids[i]){
                    s.pop();
                }else if(s.peek() == -asteroids[i]){
                    s.pop();
                    alive = false;
                    break;
                }else{
                    alive = false;
                    break;
                }
            }
             if(alive){
                    s.push(asteroids[i]);
                }
        }
        int ans[] = new int[s.size()];
        for(int i=0; i<s.size(); i++){
            ans[i] = s.get(i);
        }
        return ans;
    }
}