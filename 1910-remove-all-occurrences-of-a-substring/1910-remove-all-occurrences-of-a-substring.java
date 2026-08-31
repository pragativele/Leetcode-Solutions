class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length(); i++){
             str.append(s.charAt(i));
            if((str.length() > 0) && str.length() >= part.length()){
                String sub = str.substring(str.length() - part.length());
                if(sub.equals(part)){
                    str.setLength(str.length() - part.length());
                }
            }
           
        }
        return str.toString();
    }
}