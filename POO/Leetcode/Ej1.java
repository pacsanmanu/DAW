class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] chosen = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
               if(i == j){
                    break;
               }else if(nums[i] + nums[j] == target){
                    chosen[0] = i;
                    chosen[1] = j;
               }
            }
        }
        return chosen;
    }
}