package Lesson2;

import lesson3.enums.Pizza;
import lesson3.enums.PizzaOrder;
import lesson3.enums.PizzaSize;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testPizza {
    @Test
    public void testSmallPizzaWithCheese(){
        Pizza s = new Pizza(PizzaSize.SMALL, 1,2,0);
        assertEquals(16,s.calcPizza());
    }
    @Test
    public void testPizzaWithAllKinds(){
        Pizza m = new Pizza(PizzaSize.SMALL, 1,2,1);
        Pizza d = new Pizza(PizzaSize.MEDIUM, 1,2,1);
        Pizza a = new Pizza(PizzaSize.LARGE, 1,2,1);
        PizzaOrder po = new PizzaOrder();

        po.addPizza(m);
        po.addPizza(d);
        po.addPizza(a);
        assertEquals(54,po.calcTotalPrice());
    }
}
