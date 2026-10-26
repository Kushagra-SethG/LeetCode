class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            int current = nums[i % n];

            while (!stack.isEmpty() && stack.peek() <= current) {
                stack.pop();
            }

            if (i < n && !stack.isEmpty()) {
                result[i] = stack.peek();
            }

            stack.push(current);
        }

        return result;
    }
}