class Solution {
    public static boolean hasDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().count() != nums.length;
    }
}
