class Solution {
    public boolean ispali(int i , int j , char arr[]){
        if(i>=j) return true;

        if(!Character.isLetterOrDigit(arr[i])) return ispali(i+1 , j , arr);
        if(!Character.isLetterOrDigit(arr[j])) return ispali(i , j-1 , arr);

        if(arr[i] != arr[j]){
            return false;
        }
        return ispali(i+1 , j-1 , arr);
    }
    public boolean isPalindrome(String s) {
        
        return ispali(0,s.length()-1 , s.toLowerCase().toCharArray());
    }
}