class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0)
            return;

        int count0 = 0;
        int count1 = 0;

        for (int num : nums) {
            if (num == 0)
                count0++;
            if (num == 1)
                count1++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (count0 > 0) {
                nums[i] = 0;
                count0--;
            } else if (count1 > 0) {
                nums[i] = 1;
                count1--;
            } else {
                nums[i] = 2;
            }
        }
        return;
    }
}