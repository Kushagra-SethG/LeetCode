class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Map<Integer, Long> map = new HashMap<>();
        int top = -1;

        for (int num : nums) {
            long current = num;

            while (top >= 0 && map.get(top) == current) {
                current += map.remove(top);
                top--;
            }

            top++;
            map.put(top, current);
        }

        List<Long> result = new ArrayList<>();
        for (int i = 0; i <= top; i++) {
            result.add(map.get(i));
        }

        return result;
    }
}