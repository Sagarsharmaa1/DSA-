class Solution {
    public int[] findEvenNumbers(int[] digits) {

        int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++;
        }

        int[] temp = new int[450];
        int count = 0;

        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {

                for (int k = 0; k <= 8; k += 2) {

                    freq[i]--;
                    freq[j]--;
                    freq[k]--;

                    if (freq[i] >= 0 && freq[j] >= 0 &&  freq[k] >= 0) {
                        temp[count++] = i * 100 + j * 10 + k;
                    }
                    freq[i]++;
                    freq[j]++;
                    freq[k]++;
                }
            }
        }
        int[] result = new int[count];

        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}