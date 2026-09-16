class Solution {
    public int prefixCount(String[] words, String pref) {
        int cnt = 0;
        int len = pref.length();
        for(String i:words) {
            if(i.length()>=len && i.substring(0,len).equals(pref)) {
                cnt++;
            }
        }
        return cnt;
        
    }
}