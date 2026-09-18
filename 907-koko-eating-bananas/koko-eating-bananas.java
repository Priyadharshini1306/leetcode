class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;

        for (int i : piles) {
            r = Math.max(r, i);
        }

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (canFinish(piles, h, mid)) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return l;
    }

    boolean canFinish(int[] piles, int h, int speed) {
        long total = 0;

        for (int i : piles) {
            total += (i + speed - 1) / speed;
        }

        return total <= h;
    }
}