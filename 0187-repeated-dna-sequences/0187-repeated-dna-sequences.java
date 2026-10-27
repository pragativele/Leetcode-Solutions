class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if( s== null || s.length() < 10){
            return new ArrayList<>();
        }
        //store all new substring 
        HashSet<String> seen = new HashSet<>();
        //store repeated substring which need to be return
        HashSet<String> repeated = new HashSet<>();
        for(int i=0; i<=s.length()-10; i++){
            String sub = s.substring(i, i+10);
            if(seen.contains(sub)){
                repeated.add(sub);
            }else{
                seen.add(sub);
            }
        }
        return new ArrayList<>(repeated);
    }
}