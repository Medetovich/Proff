package lesson4.lines;

import java.util.ArrayList;
import java.util.List;

public class Triangle implements Figure {
    private List<Point> points = new ArrayList<>();

    public Triangle(List<Point> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "points=" + points +
                '}';
    }
    private double getLength(Point p0, Point p1){
        return Math.sqrt(Math.pow(p1.getX()-p0.getX(), 2));
    }
    @Override
    public double getLength() {
        Point p0 = points.get(0);
        Point p1 = points.get(1);
        Point p2 = points.get(2);
        return getLength(p0,p1)+getLength(p1,p2) + getLength(p2,p0);
    }
}
