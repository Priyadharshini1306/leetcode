class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        int n = mountain.length;
        if(n==1 && n==2) {
            return new ArrayList<>();
        }
        List<Integer> l = new ArrayList<>();
        for(int i = 1;i<=n-2;i++) {
            if(mountain[i]>mountain[i-1] && mountain[i]>mountain[i+1]) {
                l.add(i);
            }
        }
        return l;

    }
}