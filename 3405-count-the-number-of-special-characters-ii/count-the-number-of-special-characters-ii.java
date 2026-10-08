class Solution {
    public int numberOfSpecialChars(String word) {

        HashMap<Character,ArrayList<Integer>> mp = new HashMap<>();

        for(int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            mp.putIfAbsent(ch,new ArrayList<>());

            mp.get(ch).add(i);
        }

        int res = 0;

        for(char ch = 'a'; ch <= 'z'; ch++) {

            char upper = (char)(ch - 32);

            if(!mp.containsKey(ch) || !mp.containsKey(upper)) {
                continue;
            }

            int loweridx = mp.get(ch).get(mp.get(ch).size() - 1);
            int upperidx = mp.get(upper).get(0);

            if(loweridx < upperidx) {
                res++;
            }
        }

        return res;
    }
}