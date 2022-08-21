package lesson4.lines;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Rectangle implements Figure{
    private List<Point> points = new ArrayList<>();

    public Rectangle(List<Point> points) {
        this.points = points;
    }
    private double getLength(Point p0, Point p1){
        return Math.sqrt(Math.pow(p1.getX()-p0.getX(), 2));
    }

    @Override
    public double getLength() {
        List<Point> p = new ArrayList<>();
        Point p0 = points.get(0);
        Point p1 = points.get(1);
        Point p2 = points.get(2);
        Point p3 = points.get(3);
        return getLength(p0,p1)+getLength(p1,p2) + getLength(p2,p0) + getLength(p0,p3) + getLength(p1,p3) + getLength(p2,p3);
    }

    @Override
    public String toString() {
        return "123 " +  points.get(0) + " " + points.get(1) + " " + points.get(2)
                + " " + points.get(3);

    }
}
