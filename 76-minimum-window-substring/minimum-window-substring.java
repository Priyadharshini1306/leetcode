class Solution {
    public String minWindow(String s, String t) {
        int[] a = new int[256];
        int[] b = new int[256];
        for(char ch:t.toCharArray()) {
            a[ch]++;
        }
        int l = 0;
        int min = Integer.MAX_VALUE;
        int start = 0;
        for(int r = 0;r<s.length();r++) {
            b[s.charAt(r)]++;
            while(f(a,b)) {
                if(r-l+1<min) {
                    min = r-l+1;
                    start = l;
                }
                b[s.charAt(l++)]--;
            }
            
        }
        return min==Integer.MAX_VALUE?"":s.substring(start,start+min);
    }
    boolean f(int[] a,int[] b) {
        for(int i = 0;i<256;i++) {
            if(a[i]>b[i]) {
                return false;
            }
        }
        return true;
    }
}