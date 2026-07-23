class Solution {
    public boolean canJump(int[] nums) {

        if(nums == null || nums.length < 2)
            return true;

        int maxInd = 0;
        for(int i=0; i<nums.length; i++){
            if(maxInd < i){
                return false;
            }
            maxInd = Math.max(maxInd, i+nums[i]);
        }
        return maxInd >= nums.length - 1 ? true : false;
    }
}
