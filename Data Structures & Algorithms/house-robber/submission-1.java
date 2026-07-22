class Solution {
    public int rob(int[] nums) {
        
        if(nums == null || nums.length == 0)
            return 0;
        
        int include = nums[0];
        int exclude = 0;

        for(int i=1; i<nums.length; i++){

            int curr = Math.max(exclude + nums[i], include);
            
            exclude = include;
            include = curr;
        }
        return include;
    }
}
