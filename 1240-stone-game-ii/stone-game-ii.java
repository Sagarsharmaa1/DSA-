
class Solution {
    public int[][][] dp;

    public int f(int i, int m, int turn, int[] piles) {
        int n = piles.length;
        if (i == n) {
            return 0;
        }
        if (dp[i][m][turn] != -1) return dp[i][m][turn];
        
        int alice;
        if (turn == 1) { 
            alice = 0;
            int sum = 0;
            for (int ind = i; ind < i + 2 * m; ind++) {
                if (ind == n) break;
                sum += piles[ind];
                int x = ind - i + 1;
                alice = Math.max(alice, sum + f(ind + 1, Math.max(x, m), 0, piles));
            }
        } else { 
            alice = Integer.MAX_VALUE;
            for (int ind = i; ind < i + 2 * m; ind++) {
                if (ind == n) break;
                int x = ind - i + 1;
                alice = Math.min(alice, f(ind + 1, Math.max(x, m), 1, piles));
            }
        }
        return dp[i][m][turn] = alice;
    }

    public int stoneGameII(int[] piles) {
        int n = piles.length;
        dp = new int[n][n + 1][2];
        for (int[][] arr2D : dp) {
            for (int[] arr1D : arr2D) {
                Arrays.fill(arr1D, -1);
            }
        }
        return f(0, 1, 1, piles);
    }
}