class Solution {
    public int countPrefixes(String[] words, String s) {
        int cnt = 0;
        int l = s.length();
        for(String i:words) {
            int len = i.length();
            if(len<=l && s.substring(0,len).equals(i)) {
                cnt++;
            }
        }
        return cnt;
    }
}