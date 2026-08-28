class Solution {
    public boolean valid(int n) {
        int temp = n;
        int rotated = 0;
        int place = 0;
        while (n > 0) {
            int digit = n % 10;

            if (digit == 4 || digit == 3 || digit == 7) {
                return false;
            }
            if (digit == 5) {
                digit = 2;
            } else if (digit == 2) {
                digit = 5;
            } else if (digit == 6) {
                digit = 9;
            } else if (digit == 9) {
                digit = 6;
            }

            rotated += digit * Math.pow(10, place);
            place++;
            n = n / 10;
        }
        return rotated != temp;
    }

    public int rotatedDigits(int n) {
        System.out.print(valid(1));
        int sum = 0;
        for (int i = 1; i <= n; i++) {

            if (valid(i)) {
                sum += 1;
            }
        }

        return sum;
    }
}