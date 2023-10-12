package edu.hw1;

import static java.lang.Math.min;

public class Task3 {

    public static boolean isNestable(int[] first_arr, int[] second_arr){
        if(minValue(first_arr) > minValue(second_arr) && maxValue(first_arr) < maxValue(second_arr)){
            return true;
        }
        return false;
    }
    private static int minValue(int[] arr){
        int min = arr[0];
        for(var elem: arr){
            min = Math.min(elem, min);
        }
        return min;
    }

    private static int maxValue(int[] arr){
        int max = arr[0];
        for(var elem: arr){
            max = Math.max(elem, max);
        }
        return max;
    }

}
