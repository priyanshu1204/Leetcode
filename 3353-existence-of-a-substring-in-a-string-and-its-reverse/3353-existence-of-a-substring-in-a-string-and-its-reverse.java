class Solution {

    public boolean isSubstringPresent(String s) {
        StringBuilder sb=new StringBuilder(s);
        String rev=sb.reverse().toString();

        for(int i=0;i<s.length()-1;i++){
            int st=0,end=2;
            String sub=rev.substring(i,i+2);
            if(s.contains(sub)){
                return true;
            }
        }
        return false;
    }
}



// class Solution {
//     public boolean isSubstringPresent(String s) {
//         Set<String> seen = new HashSet<>();

//         for (int i = 0; i < s.length() - 1; i++) {
//             String sub = s.substring(i, i + 2);

//             // Case 1: same characters like "aa"
//             if (sub.charAt(0) == sub.charAt(1)) return true;

//             // Case 2: check if reverse substring is already seen
//             String rev = "" + sub.charAt(1) + sub.charAt(0);
//             if (seen.contains(rev)) return true;

//             // store the current pair
//             seen.add(sub);
//         }
//         return false;
//     }