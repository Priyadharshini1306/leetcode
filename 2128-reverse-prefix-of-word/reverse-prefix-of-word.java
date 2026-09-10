class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for(int i = 0;i<word.length();i++) {
            if(word.charAt(i)==ch) {
                idx = i;
                break;
            }
        }
        for(int i = idx;i>=0;i--) {
            sb.append(word.charAt(i));
        }
        sb.append(word.substring(idx+1,word.length()));
        return sb.toString();
    }
}