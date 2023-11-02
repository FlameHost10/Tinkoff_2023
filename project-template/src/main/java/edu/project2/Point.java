package edu.project2;

public record Point(int height, int width, PointType type) {
    public enum PointType{
        PASSAGE,
        WALL
    }

}
