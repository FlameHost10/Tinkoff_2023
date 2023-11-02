package edu;

import edu.project2.Maze;
import edu.project2.Point;
import java.io.IOException;

public final class Main {
    public static void main(String[] args) throws IOException {

        Maze mazeMain = new Maze(20, 20, Maze.GeneratorType.PERFECT_GENERATOR);
        System.out.println(mazeMain);

    }
}
