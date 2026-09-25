class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++) {
            if(nums[i]%2==0)
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer>[] buc = new List[nums.length+1];
        for(int key:map.keySet()) {
            int val = map.get(key);
            if(buc[val]==null) {
                buc[val] = new ArrayList<>();
            }
            buc[val].add(key);
        }
        for(int i = buc.length-1;i>=0;i--) {
            if(buc[i]!=null) {
                int min = Integer.MAX_VALUE;
                for(int j:buc[i]) {
                    min = Math.min(min,j);
                }
                return min;
            }
        }
        return -1;
    }
}