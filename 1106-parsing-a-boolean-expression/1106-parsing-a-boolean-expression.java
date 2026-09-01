class Solution {
    public boolean parseBoolExpr(String expression) {
       
        Stack<Character> s = new Stack<>();
        for(int i=0; i<expression.length(); i++){
            char ch = expression.charAt(i);
            if(ch == ')'){
                 boolean T = false;
                 boolean F = false;
                while(s.peek() != '('){
                    char c = s.pop();
                    if(c == 'f'){
                        F = true;
                    }
                    if(c == 't'){
                        T = true;
                    }
                }
                s.pop();
                char op = s.pop();
                if(op == '!'){
                    s.push(T ? 'f': 't');
                }else if(op == '&'){
                    s.push(F ? 'f' : 't');
                }else if(op == '|'){
                    s.push(T ? 't' : 'f');
                }
            }else{
                    s.push(ch);
                }
        }
        return s.peek() == 't';
    }
}