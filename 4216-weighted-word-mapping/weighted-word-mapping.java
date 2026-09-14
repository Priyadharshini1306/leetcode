class Solution {
    public String mapWordWeights(String[] w, int[] we) {
        StringBuilder s = new StringBuilder();
        for(int i = 0;i<w.length;i++) {
            int weight = 0;
            for(int j = 0;j<w[i].length();j++) {
                weight+= we[w[i].charAt(j)-'a'];
            }
            s.append((char)('z'-weight%26));
        }
        return s.toString();
    }
}