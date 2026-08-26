class Solution {
    public int compareVersion(String version1, String version2) {
        String arr1[] = version1.split("\\."); //split string into string arr like("1", "01", "0")
        String arr2[] = version2.split("\\.");
        //max is taken coz arr both the arr have diff size
        for(int i=0; i<Math.max(arr1.length, arr2.length); i++){
            //convert arr[i] into integer coz arr is in string format
            int num1 = i < arr1.length ? Integer.parseInt(arr1[i]) : 0;
            int num2 = i< arr2.length ? Integer.parseInt(arr2[i]) : 0;
            if(num1 < num2){
                return -1;
            }
            if(num1 > num2){
                return 1;
            }
        }
        return 0;
    }
}