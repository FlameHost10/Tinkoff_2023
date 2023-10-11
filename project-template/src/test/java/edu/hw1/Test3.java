package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Test3 {
    @Test
    @DisplayName("")
    void Determining_number_digits_in_number() {
        int[] tests = {0, 3, 10, 23, 1422, 123456};

        for(int test:tests){
            System.out.println(test + " -> " + Task2.countDigits(test));
        }

    }
}
