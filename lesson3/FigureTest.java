package lesson3;

import java.util.ArrayList;
import java.util.List;

public class FigureTest {
    public static void main(String[] args) {
        List <FigureInterface> figures = new ArrayList<>();
        figures.add(new Rectangle(2,3));
        figures.add(new Ellipse(2,3));

        double per =0;
        double area = 0;
        double price=0;
        for (int i = 0; i < figures.size() ; i++) {
            per += figures.get(i).getPerimeter();
            area += figures.get(i).getArea();
          /*  price += figures.get(i).calcPrice();*/
        }

        System.out.println(area + " = " + " area");
        System.out.println(per + " = " + " perimeter");
    }
}
