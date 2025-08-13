class Solution {
    public String removeDigit(String number, char digit) {
     String maxres ="";
     int n = number.length();
     for(int i= 0;i< n;i++){
        if(number.charAt(i) == digit){
            String res = number.substring(0,i)+number.substring(i+1);
            if(maxres.isEmpty() || res.compareTo(maxres) > 0){
                maxres = res;
            }
        }

     }
        return maxres;

    
    }
}