class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i:nums) {
            m.put(i,m.getOrDefault(i,0)+1);
        }
        int[] ans = new int[2];
        int count = 0;
        for(Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if(entry.getValue()==1) {
                ans[count++] = entry.getKey();
            }
        }
        return ans;
    }
}