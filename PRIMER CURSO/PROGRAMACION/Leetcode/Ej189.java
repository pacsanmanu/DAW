package Leetcode;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        int aux = 0;
        for (int i = 0; i < k; i++) {
            for (int j = nums.length - 1; j > 0; j--) {
                if (j == nums.length - 1) {
                    aux = nums[j];
                }
                nums[j] = nums[j - 1];
            }

            if(nums.length > 1){
                nums[0] = aux;
            }
        }
    }
}

// public class rotararray {
// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);
// int[] array = new int[10];
// int sobrante = 0;

// for(int i = 0; i < array.length; i++){
// System.out.println("Dime un numero:");
// array[i] = sc.nextInt();
// }

// System.out.println("Cuantas veces quieres rotar el array?");
// int n = sc.nextInt();

// for(int i = 0; i < n; i++){

// for(int j = array.length - 1; j > 0; j--){

// if(j == array.length - 1){
// sobrante = array[j];
// }
// array[j] = array[j - 1];
// }

// array[0] = sobrante;
// }

// System.out.print("[");
// for(int i= 0; i < array.length; i++){
// System.out.print(array[i] + ", ");
// }
// System.out.print("]");

// }
// }
