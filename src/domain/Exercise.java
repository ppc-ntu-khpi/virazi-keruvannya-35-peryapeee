package domain;

import java.util.Arrays;

public class Exercise {
    /**
     *The function takes an array, sorts it in ascending order. Then, with the algorithm, I look for a real second number in magnitude, that is, in the array {1, 2, 2}, the second largest will be 1.
     * @param arr input array
     * @return second largest number
     */
    public static int Calculate(int[] arr){
        Arrays.sort(arr);

        int i = 1;
        while(arr[arr.length - (i+1)] == arr[arr.length - i]){
            i++;
            if(arr[arr.length - (i+1)] != arr[arr.length - i]){
                return arr[arr.length - (i+1)];
            }
        }
        return arr[arr.length - 2];
    }
}
