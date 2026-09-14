class Solution {
    public int[] findDegrees(int[][] m) {
        int[] a = new int[m.length];
        for(int i = 0;i<m.length;i++) {
            for(int j = 0;j<m[0].length;j++) {
                if(m[i][j]==1) {
                    a[i]++;
                }
            }
        }
        return a;
    }
}