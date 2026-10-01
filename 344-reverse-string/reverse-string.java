class Solution {
    public void reverse(char str[] , int i , int j){
        if(i== str.length) return;

        char ch = str[i];
        reverse(str , i+1 , j-1);

        str[j] = ch;
    }
    public void reverseString(char[] s) {
        reverse(s , 0 , s.length-1);
    }
}