class Solution {
    public int[][] insert(int[][] intervals, int[] n) {
        List<int[]> l = new ArrayList<>();
        int i = 0;
        while(i<intervals.length && intervals[i][1]<n[0]) {
            l.add(intervals[i]);
            i++;
        }
        while(i<intervals.length && intervals[i][0] <= n[1] ) {
            n[0] = Math.min(n[0],intervals[i][0]);
            n[1] = Math.max(n[1],intervals[i][1]);
            i++;
        }
        l.add(n);
        while(i<intervals.length) {
            l.add(intervals[i]);
            i++;
        }
        return l.toArray(new int[0][]);
    }
}