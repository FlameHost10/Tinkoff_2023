package edu.project1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.IOException;

public class Test6 {
    @Test
    @DisplayName("Общий тест игры")
    void guess_letter() throws IOException {
        String s = Project1.word_change();
        Gallows gallows = new Gallows(s);

        for(int i = 0; i < s.length(); i++){
            if(i % 2 == 0){
                gallows.guess_letter(String.valueOf(s.charAt(i)));
            }
            else{
                gallows.guess_letter("z");
            }
        }




    }
}
