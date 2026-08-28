class Solution {
    public boolean checkDivisibility(int n) {
        
        int one =0;
        int two = 1;
        int temp = n;
        while(n > 0){
            int digit = n % 10;

            one+= digit;
            two *= digit;

            n = n/10;
        }

        return temp % (one + two)==0;
    }
}