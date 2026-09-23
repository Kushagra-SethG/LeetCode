class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int a = 0, b = 0, c = 0; 
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) a++;
            else if (nums[i] == 1) b++;
            else c++;
        }
        int i = 0;
        while (a > 0) {
            nums[i++] = 0;
            a--;
        }
        while (b > 0) {
            nums[i++] = 1;
            b--;
        }
        while (c > 0) {
            nums[i++] = 2;
            c--;
        }
    }
}