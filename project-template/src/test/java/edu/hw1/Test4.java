package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Test4 {
    @Test
    @DisplayName("Исправление строки")
    void correcting_incorrect_string() {
        String[] tests = {"12345", "hTsii  s aimex dpus rtni.g", "badce", "iSpmelt set"};

        for(String test:tests){
            System.out.println(test + "\t->\t" + Task4.fixString((test)));
        }

    }
}
