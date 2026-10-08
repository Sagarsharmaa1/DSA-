class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] levels = new int[n];
        int depth = 0;
        int maxDepth = 0;

        for (int i = 0; i < n; i++) {
            if (seq.charAt(i) == '(') {
                depth++;
                levels[i] = depth;
                maxDepth = Math.max(maxDepth, depth);
            } else {
                levels[i] = depth;
                depth--;
            }
        }

        int bestCutoff = 0;
        int bestScore = n + 1;
        for (int cutoff = 0; cutoff <= maxDepth; cutoff++) {
            int score = Math.max(cutoff, maxDepth - cutoff);
            if (score < bestScore) {
                bestScore = score;
                bestCutoff = cutoff;
            }
        }

        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = levels[i] <= bestCutoff ? 0 : 1;
        }
        return answer;
    }
}