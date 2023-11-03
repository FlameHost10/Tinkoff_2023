package edu.project2;

import java.util.Objects;

public record Point(int height, int width, PointType type) {
    public enum PointType{
        PASSAGE,
        WALL
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return height == point.height && width == point.width && type == point.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width, type);
    }
}
