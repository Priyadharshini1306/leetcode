class Solution {
    public List<String> buildArray(int[] t, int n) {
        List<String> l = new ArrayList<>();
        int j = 1;
        int i = 0;
        while(i<t.length) {
            l.add("Push");
            if(t[i]==j) {
                i++;
            } else {
                l.add("Pop");
            }
            j++;
        }
        return l;
    }
}