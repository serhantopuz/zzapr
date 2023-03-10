package utils;

import java.util.Arrays;

public class Task03 {

    public static void generateRandArray(int[] arr){
        int randomNum;


        for (int i = 0; i < arr.length; i++){
            randomNum = (int) (20 * Math.random());
            arr[i] = randomNum;
        }

    }

    public static void writeRandArray(int[] arr){
        System.out.println(Arrays.toString(arr));
        System.out.print("\n");
    }

    public static void sortAscending(int[] arr){
        int lowest;
        int lowestIndex;
        for (int i = 0; i < arr.length; i++){
            lowestIndex = i;
            lowest = arr[i];
            for (int j = (i + 1); j < arr.length; j++){
                if(lowest >= arr[j]){
                    lowest = arr[j];
                    lowestIndex = j;
                }
            }
            arr[lowestIndex] = arr[i];
            arr[i] = lowest;
        }
    }

    public static void arrayOppositeDirection(int[] arr){
        int last = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++){
            int tmp = arr[i];
            arr[i] = arr[last];
            arr[last] = tmp;

            last = last -1;
        }
    }
}
