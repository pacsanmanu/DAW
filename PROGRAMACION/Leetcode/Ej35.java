package Leetcode;
public class Ej35 {
    public static void main(String[] args) {
        int[] nums = {2,3,4,7,8,9};
        int target = 11;
        System.out.println(searchInsert(nums, target));
    }
    public static int searchInsert(int[] nums, int target) {
        int position = -1;
        int counter = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                position = i;
            }
        }
        while(position == -1){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] + counter == target){
                    position = i + counter;
                    break;
                }else if(nums[i] - counter == target){
                    if(i == 0){
                        position = 0;
                    }else{
                        position = i - counter;
                    }
                }
            }
            counter++;
        }
        if(position == nums.length){
            return position;
        }else if(position == 0 && nums[position] < target){
            position++;
        }else if(position > nums.length){
            position = nums.length;
        }
        return position;
    }
}
