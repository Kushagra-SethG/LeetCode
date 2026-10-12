import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int findKthPositive(int[] arr, int k) {
        Deque<Integer> stack = new ArrayDeque<>();
        int i = 0;
        int current = 1;

        while (stack.size() < k) {
            if (i < arr.length && arr[i] == current) {
                i++;
            } else {
                stack.push(current);
            }
            current++;
        }

        return stack.peek();
    }
}