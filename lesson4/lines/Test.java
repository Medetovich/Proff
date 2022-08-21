package lesson4.lines;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        Point po1 = new Point(5,2);
        Point po2 = new Point(2,3);
        Point po3 = new Point(1,8);
        Point po4 = new Point(7,2);
        Point po5 = new Point(3,5);
        points.add(po1);
        points.add(po2);
        points.add(po3);
        points.add(po4);
        Rectangle rec = new Rectangle(points);
        System.out.println(rec.getLength());
        Polyline pol = new Polyline(points);
        //pol.appendPoint(po5);
        System.out.println(pol.getLength());
        System.out.println(rec.toString());
    }
}
