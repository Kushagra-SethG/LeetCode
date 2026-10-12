import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findKthPositive(int[] arr, int k) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, true);
        }

        int current = 1;
        while (k > 0) {
            if (!map.containsKey(current)) {
                k--;
                if (k == 0) {
                    return current;
                }
            }
            current++;
        }

        return current;
    }
}
