class Solution {
    public int singleNonDuplicate(int[] arr) {
        if(arr.length==1) {
            return arr[0];
        }
        if(arr[0]!=arr[1]) {
            return arr[0];
        }
        if(arr[arr.length-1]!=arr[arr.length-2]) {
            return arr[arr.length-1];
        }
        int l = 1,r = arr.length-2;
        int ans = 0;
        while(l<=r) {
            int mid = l+(r-l)/2;
            if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]) {
                ans = arr[mid];
                break;
            }
            if((mid%2!=0 && arr[mid]==arr[mid-1]) || (mid%2==0 && arr[mid] == arr[mid+1])) {
                l = mid+1;
            } else {
                r = mid-1;
            }
        }
        return ans;
    }
}