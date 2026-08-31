class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int length = Integer.MAX_VALUE;
        int l = 0;
        int currSum = 0;
        for (int r = 0; r < nums.length; r++) {
            currSum += nums[r];

            while (currSum >= target) {
                length = Math.min(length, r - l + 1);
                currSum -= nums[l++];
            }
        }
        return length == Integer.MAX_VALUE ? 0 : length;
    }
}