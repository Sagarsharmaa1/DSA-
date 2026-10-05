import java.math.BigInteger;

class Solution {
    public boolean checkValidString(String s) {
        BigInteger mask = BigInteger.ONE;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                mask = mask.shiftLeft(1);
            } else if (ch == ')') {
                mask = mask.shiftRight(1);
            } else {
                mask = mask.shiftLeft(1)
                           .or(mask)
                           .or(mask.shiftRight(1));
            }
        }

        return mask.testBit(0);
    }
}