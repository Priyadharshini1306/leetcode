class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length+1];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int key:map.keySet()) {
            int val = map.get(key);
            if(bucket[val]==null) {
                bucket[val] = new ArrayList<>();
            }
            bucket[val].add(key);
        }
        int[] res = new int[k];
        int count = 0;
        for(int i = bucket.length-1;i>=0 && count<k;i--) {
            if(bucket[i]!=null) {
                for(Integer j:bucket[i]) {
                    res[count++] = j;
                }
            }
        }
        return res;
    }
}