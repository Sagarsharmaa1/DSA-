class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[][][] dp = new int[n + 1][n + 1][2];
        
        for(int i = n - 1; i >= 0; i--) {
            for(int m = 0; m <= n; m++) {
                for(int turn = 0; turn <= 1; turn++) {
                    int alice;
                    if(turn == 1) {
                        alice = 0;
                        int sum = 0;
                        for(int ind = i; ind < i + 2 * m; ind++) {
                            if(ind == n) break;
                            sum += piles[ind];
                            int x = ind - i + 1;
                            alice = Math.max(alice, sum + dp[ind + 1][Math.max(x, m)][0]);
                        }
                    } else { 
                        alice = Integer.MAX_VALUE;
                        for(int ind = i; ind < i + 2 * m; ind++) {
                            if(ind == n) break;
                            int x = ind - i + 1;
                            alice = Math.min(alice, dp[ind + 1][Math.max(x, m)][1]);
                        }
                    }
                    dp[i][m][turn] = alice;
                }
            }
        }
        return dp[0][1][1];
    }
}