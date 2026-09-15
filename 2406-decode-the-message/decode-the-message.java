class Solution {
    public String decodeMessage(String key, String m) {
        int[] a = new int[26];
        int c = 97;
        for(int i = 0;i<key.length();i++) {
            if(key.charAt(i)!=' ' && a[key.charAt(i)-'a']==0) {
                a[key.charAt(i)-'a'] = c;
                c++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<m.length();i++) {
            if(m.charAt(i)==' ') {
                sb.append(' ');
                continue;
            }
            sb.append((char)(a[m.charAt(i)-'a']));
        }
        return sb.toString();
    }
}