package Leetcode;

public class Ej35 {
    public static void main(String[] args) {
        int nums[] = {1,3,5,6};
        int target = 0;
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
            if(position == -1){
                for(int i = 0; i < nums.length; i++){
                    if(nums[i] + 1 == target){
                        position = i + 1;
                        break;
                    }else if(nums[i] - 1 == target){
                        if(i == 0){
                            position = 0;
                        }else{
                            position = i - 1;
                        }
                    }
                }
            }
            counter++;
        }
        return position;
    }
}
