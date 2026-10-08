class Solution {
    public int reverseDegree(String s) {
            int sum = 0, nor, rev;

    for (int i = 0; i < s.length(); i++) {

        char ch = s.charAt(i);

        String alpha = "abcdefghijklmnopqrstuvwxyz";

        nor = alpha.indexOf(ch) + 1;

        rev = 27 - nor;

        sum += rev * (i + 1);
    }

    return sum;
}
    
}