class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n=temp.length;
        int[] ans=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty()&&temp[stack.peek()]<temp[i]){
                ans[stack.peek()]=i-stack.pop();
            }
            stack.push(i);
                }        return ans;
    }
}