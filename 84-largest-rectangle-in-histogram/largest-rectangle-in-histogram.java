class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea=0;
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=0;i<heights.length;i++){
            while(!stack.isEmpty() && heights[i]<heights[stack.peek()]){
                int smthg=stack.pop();
                int height=heights[smthg];
                int width;
                if(stack.isEmpty()){
                    width=i;
                }else{
                    width=i-1-stack.peek();
                }
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int prev = stack.pop();
            int height = heights[prev];
            int width;
            if (stack.isEmpty()) {
                width = heights.length;
            } else {
                width = heights.length - stack.peek() - 1;
            }
            maxArea = Math.max(maxArea, height * width);
        }
        return maxArea;
    }
}