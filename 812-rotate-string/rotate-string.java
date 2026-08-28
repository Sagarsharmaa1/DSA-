class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        String str = s + s;

        int si = 0;
        int ei = goal.length()-1;

        while(ei < str.length()){
            String sub = str.substring(si , ei+1);
           
            if(sub.equals(goal)){
                return true;
            }

            si++;
            ei++;
        }
        return false;
    }
}