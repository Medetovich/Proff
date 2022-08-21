package lesson1.geometry;

public class Rectangle {

    private Point sw;
    private Point ne;
    public Rectangle(Point a, Point b){
        sw=a;
        ne=b;
    }
    public int getArea(){
        return (sw.getX() - ne.getX()) * (sw.getY() - ne.getY());
    }





}
