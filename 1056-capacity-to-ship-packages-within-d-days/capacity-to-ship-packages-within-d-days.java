class Solution {
    private boolean canShip(int[] weights, int days, int capacity) {
        int total = 0;
        int d = 1;
        for (int i = 0; i < weights.length; i++) {
            if (total + weights[i] > capacity) {
                d++;
                total = 0;
            }
            total += weights[i];
            if (d > days) return false;
        }
        return true;
    }

    public int shipWithinDays(int[] weights, int days) {
        int start = 0, end = 0;
        for (int i = 0; i < weights.length; i++) {
            start = Math.max(start, weights[i]);
            end += weights[i];
        }

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (canShip(weights, days, mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}