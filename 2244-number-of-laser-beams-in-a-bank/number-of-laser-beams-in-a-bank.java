class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> l = new ArrayList<>();
        for(int i = 0;i<bank.length;i++) {
            int count = 0;
            for(int j = 0;j<bank[0].length();j++) {
                if(bank[i].charAt(j)=='1') {
                    count++;
                }
            }
            if(count!=0) {
                l.add(count);
            }
        }
        int ans = 0;
        for(int i =0;i<l.size()-1;i++) {
            int pro = l.get(i)*l.get(i+1);
            ans += pro;
        }
        return ans;
    }
}