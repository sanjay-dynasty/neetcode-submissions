class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] prefix = new int[nums.length];
        prefix[0] = 1;
        prefix[1] = nums[0];
        for(int i = 2; i<nums.length; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        for(int i = nums.length-2; i>=0; i--){
            prefix[i] = prefix[i]*nums[i+1];
            nums[i] = nums[i] * nums[i+1];
        }

        return prefix;

        
    }
}  
