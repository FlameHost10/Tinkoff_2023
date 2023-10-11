package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Test1 {
    @Test
    @DisplayName("Длина видео в секундах")
    void Determining_length_video() {
        String[] tests = {"20:1", "10:23", "1232", "21:wefaa", "0:0", "11:60", "-12:10","20:-2"};

        for(String test:tests){
            System.out.println(test + " -> " + Task1.minutesToSeconds(test));
        }

    }
}
