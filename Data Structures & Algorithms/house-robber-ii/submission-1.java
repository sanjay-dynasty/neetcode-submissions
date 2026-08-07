class Solution {
    private int solve(int nums[], int l, int r) {
        int include = nums[l];
        int exclude = 0;

        for (int i = l + 1; i <= r; i++) {
            int curr = Math.max(exclude + nums[i], include);
            exclude = include;
            include = curr;
        }
        return include;
    }
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        
        if(nums.length == 1)
            return nums[0];

        int rob1 = solve(nums, 0, nums.length - 2);
        int rob2 = solve(nums, 1, nums.length - 1);

        return Math.max(rob1, rob2);
    }
}
