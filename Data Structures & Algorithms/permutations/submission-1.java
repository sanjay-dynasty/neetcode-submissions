class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();

    void backtrack(boolean[] used, int[] nums) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i])
                continue;
            temp.add(nums[i]);
            used[i] = true;
            backtrack(used, nums);
            used[i] = false;

            temp.remove(temp.size() - 1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0)
            return res;

        boolean[] used = new boolean[nums.length];

        backtrack(used, nums);

        return res;
    }
}
