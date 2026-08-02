class Solution {

    List<List<Integer>> res = new ArrayList<>();
    List<Integer> combination = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {

        backtrack(nums, 0, nums.length, target);
        return res;
    }

    private void backtrack(int[] nums, int index, int end, int target){
        if(target == 0){
            res.add(new ArrayList<>(combination));
            return;
        }
        if(index == end || target < 0)
            return;
        
        combination.add(nums[index]);
        backtrack(nums, index, end, target-nums[index]);
        combination.remove(combination.size()-1);
        backtrack(nums, index+1, end, target);
    }
}
