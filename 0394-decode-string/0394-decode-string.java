class Solution {
    public String decodeString(String s) {
        Stack<Integer> numS = new Stack<>();
        Stack<String> str = new Stack<>();
        int num = 0;
        String curr = "";
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                //build a number if number is 12, 143(more than 1 digit)
                num = num * 10 +(ch - '0');
            }else if(ch == '['){
                numS.push(num);
                str.push(curr);
                num =0;
                curr = "";
            }else if(Character.isLetter(ch)){
                curr += ch;
            }else if(ch == ']'){
                int repeat = numS.pop();
                String temp = "";
                //take prev string
                String prev = str.pop();
                //repeat curr string and store it in temp
                for(int j=0; j<repeat; j++){
                    temp += curr;
                }
                //concat prev + temp string
                curr = prev + temp;
            }

        }
        return curr;
    }
}