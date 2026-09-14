class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] a = new int[nums.length];
        int j = 0;
        int countp = 0;
        for(int i = 0;i<nums.length;i++) {
            if(nums[i]<pivot) {
                a[j] = nums[i];
                j++;
            }
            if(nums[i]==pivot) countp++;
        }
        for(int i = 0;i<countp;i++) {
            a[j] = pivot;
            j++;
        }
        for(int i = 0;i<nums.length;i++) {
            if(nums[i]>pivot) {
                a[j] = nums[i];
                j++;
            }
        }
        return a;
    }
}