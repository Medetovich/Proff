package lesson4.lines;

import java.util.ArrayList;
import java.util.List;

public class Polyline implements Figure {
    private List<Point> points = new ArrayList<>();

    public Polyline(List<Point> points) {
        this.points = points;
    }
    private double getLength(Point p0, Point p1){
        return Math.sqrt(Math.pow(p1.getX()-p0.getX(), 2));
    }
    public void appendPoint(Point p){
        points.add(p);
    }
    @Override
    public double getLength() {
        double sumOfLength=0;
        for (int i = 0; i < points.size(); i++) {
            for (int j = 1; j < points.size(); j++) {
                if(j==i || j < i){
                    continue;
                }
                sumOfLength += getLength(points.get(i), points.get(j));
            }

        }

        return sumOfLength;
    }

}
