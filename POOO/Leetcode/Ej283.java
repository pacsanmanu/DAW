package Leetcode;
import java.util.Arrays;

public class Ej283 {
    public static void main(String[] args) {
        int[] numeros = {0,1,0,3,12};
        moveZeroes(numeros);
        System.out.println(Arrays.toString(numeros));
    }

    public static void moveZeroes(int[] nums) {
        int aux = 0;
        int cont = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == 0){
                while(nums[i+cont]!=0){
                    aux = nums[i+1];
                    nums[i+1] = nums[i];
                    nums[i] = aux;
                    cont++;
                }
            }else if(nums[i-1] == 0 || nums[i-1] > nums[i]){
                aux = nums[i];
                nums[i] = nums[i-1];
                nums[i-1] = aux;                
            }
        }
    }
}
