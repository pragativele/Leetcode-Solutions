class Solution {
    public int calculate(String s) {
        int num = 0;
        char sign = '+';
        Stack<Integer> st = new Stack<>();
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++){
            char ch = arr[i];
            if(Character.isDigit(ch)){
                num = num* 10 + (ch - '0');
            }
            if((!Character.isDigit(ch) && ch != ' ') || (i == arr.length-1)){
                 if(sign == '+'){
                st.push(num);
            }else if(sign == '-'){
                st.push(-num);
            }else if(sign == '*'){
                int num2 = st.pop();
                st.push(num * num2);
            }else if(sign == '/'){
                int num2 = st.pop();
                st.push(num2 / num);
            }
            sign = ch;
            num = 0;
            }
           
        }
        int ans =0;
        while(!st.isEmpty()){
             ans += st.pop();
        }
        return ans;
    }
}