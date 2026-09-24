class Solution {
    public int smallestIndex(int[] nums) {
        int idx = 0;
        for(int i = 0;i<nums.length;i++) {
            int a = nums[i];
            int sum = 0;
            while(a>0) {
                sum += a%10;
                a /= 10;
            }
            if(sum==i) {
                return sum;
            }
        }
        return -1;
    }
}