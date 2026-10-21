class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Deque<Long> stack = new ArrayDeque<>();

        for (int num : nums) {
            long current = num;

            while (!stack.isEmpty() && stack.peek() == current) {
                current += stack.pop();
            }

            stack.push(current);
        }

        List<Long> result = new ArrayList<>();
        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }

        Collections.reverse(result);
        return result;
    }
}