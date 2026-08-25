class Solution {
    public int missingMultiple(int[] nums, int k) {
        
        int max = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for(int elem : nums){
            set.add(elem);
            max = Math.max(max , elem);
        }

        int ans = k;
        while(ans<=max){
            if(!set.contains(ans)){
                return ans;
            }else{
                ans += k;
            }
        }
       
       return ans;
    }
}