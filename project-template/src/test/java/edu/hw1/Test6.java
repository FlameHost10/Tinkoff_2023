package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Test6 {
    @Test
    @DisplayName("Поиск первого появления постоянной Капрекара")
    void constant_K(){
        int[] tests = {6621, 6554, 1234, 6174, 1222};

        for(var test: tests){
            System.out.println(test + "\t->\t" + Task6.countK(test));
        }
    }
}
