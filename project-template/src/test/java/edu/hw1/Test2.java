package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Test2 {
    @Test
    @DisplayName("Количество цифр в числе")
    void Determining_number_digits_in_number() {
        int[] tests = {0, 3, 10, 23, 1422, 123456};

        for(int test:tests){
            System.out.println(test + "\t->\t" + Task2.countDigits(test));
        }

    }
}
