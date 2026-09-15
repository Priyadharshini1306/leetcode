class Solution {
    public int balancedStringSplit(String s) {
        int rcount = 0;
        int count = 0;
        for(int i = 0;i<s.length();i++) {
            if(s.charAt(i)=='R') {
                rcount++;
            } else {
                rcount--;
            }
            if(rcount==0) {
                count++;
            }
        }
        return count;
    }
}