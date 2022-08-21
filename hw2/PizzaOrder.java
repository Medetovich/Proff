package hw2;

import java.util.ArrayList;

public class PizzaOrder {
    private static ArrayList<Pizza> sum = new ArrayList<>();
    public static void main(String[] args) {
        Pizza piz = new Pizza("large", 2,1,1);
        Pizza p = new Pizza("Small",1,2, 2);
        Pizza pi = new Pizza("Large", 2,1,1);
        Pizza pizza = new Pizza("Small",1,2, 2);
        Pizza pizz = new Pizza("medium", 1,0,1);
        Pizza pizza1 = new Pizza("Medium",1,4, 2);
        PizzaOrder order = new PizzaOrder();
        order.addPizza(piz);
        order.addPizza(p);
        order.addPizza(pi);
        order.addPizza(pizza);
        order.addPizza(pizz);
        order.addPizza(pizza1);
        System.out.println(p.calcPizza());
        System.out.println(order.calcTotalPrice());


    }
    public void addPizza(Pizza a){
        sum.add(a);
    }
    public int calcTotalPrice(){
        int sumOfOrder = 0;
        for (Pizza i : sum){
            sumOfOrder += i.calcPizza();
        }
    return sumOfOrder;
    }
}
