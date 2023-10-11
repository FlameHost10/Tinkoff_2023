package edu.hw1;

public class Task5 {
    private static int len_numb = 0;
    public static boolean isPalindromeDescendant(int numb){
        int correct_orientation = numb;
        int reverse_orientation = 0;
        while (correct_orientation > 0) {
            reverse_orientation = reverse_orientation * 10 + correct_orientation % 10;
            correct_orientation /= 10;
            len_numb++;
        }
        System.out.println(numb + " " + reverse_orientation );

        if(numb == reverse_orientation){
            return true;
        }
        else{
            int descendant = search_for_descendant(numb);
            if(descendant == -1){
                return false;
            }
            System.out.println(numb  + " " + descendant + "=======");
            return isPalindromeDescendant(descendant);

        }
    }
    private static int search_for_descendant(int numb){
        int descendant = 0;
        int last_digit = 0;
        if(len_numb % 2 == 1){
            last_digit = numb % 10;
            numb /= 10;

        }
        while (numb > 0) {
            int sum_2_last_digit = numb % 10;
            numb /= 10;
            sum_2_last_digit += numb % 10;
            numb /= 10;
            descendant = descendant * 100 + sum_2_last_digit;
        }
        if(len_numb % 2 == 1){
            descendant = descendant * 10 + last_digit;
        }
        if(descendant < 10){
            return -1;
        }
        return descendant;

    }
}
