package edu.project1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.IOException;

public class Test3 {

    @Test
    @DisplayName("тест метода, который проверяет слово на наличие буквы (тест на победу и крректность вывода слова )")
    void guess_letter() throws IOException {
        String s = Project1.word_change();
        Gallows gallows = new Gallows(s);
        for(var elem: s.toCharArray()){
            gallows.guess_letter(String.valueOf(elem));
        }

    }
}
