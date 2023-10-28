package edu.hw2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.ClassBasedNavigableIterableAssert.assertThat;

public class Test2 {
    static Arguments[] rectangles() {
        return new Arguments[]{
            Arguments.of(new Task2.Rectangle()),
            Arguments.of(new Task2.Square())
        };
    }

    @ParameterizedTest
    @MethodSource("rectangles")
    void rectangleArea(Task2.Rectangle rect) {
        rect.setWidth(20);
        rect.setHeight(10);

        //assertThat(rect.area()).isEqualTo(200.0);
    }
}
