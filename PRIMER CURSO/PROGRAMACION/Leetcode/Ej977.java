package Leetcode;
import java.util.Arrays;
public class Ej977 {
    public static void main(String[] args) {
        int[] prueba = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(prueba)));
    }

    public static int[] sortedSquares(int[] nums) {
        int aux;
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        for(int i = 1; i < nums.length; i++){
            for(int j = i; j > 0; j--){
                if(nums[j] < nums[j - 1]){
                    aux = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = aux;
                }
            }
        }
        return nums;
    }
}

