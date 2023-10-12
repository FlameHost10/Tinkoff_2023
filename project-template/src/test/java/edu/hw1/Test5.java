package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Test5 {
    @Test
    @DisplayName("Исправление строки")
    void checking_special_palindrome(){
        int[] tests = {5, 11211230, 13001120, 1123, 11, 23336014};

        for(int test:tests){
            System.out.println(test + "\t->\t" + Task5.isPalindromeDescendant(test));
        }


    }
}
