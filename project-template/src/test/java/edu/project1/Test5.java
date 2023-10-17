package edu.project1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.IOException;

public class Test5 {
    @Test
    @DisplayName("тест метода, который проверяет слово на наличие буквы (тест на некорректные данные)")
    void guess_letter() throws IOException {
        String s = Project1.word_change();
        Gallows gallows = new Gallows(s);
        gallows.guess_letter("");
        gallows.guess_letter("4");
        gallows.guess_letter("fw4fw");

    }
}
