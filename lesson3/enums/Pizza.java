package lesson3.enums;

import java.util.ArrayList;
import java.util.Locale;

public class Pizza {
    private PizzaSize size;

    int quantityOfCheese;
    int pepperoni;
    int ham;

    public Pizza(PizzaSize size, int quantityOfCheese, int pepperoni, int ham) {
        this.size = size;
        this.quantityOfCheese = quantityOfCheese;
        this.pepperoni = pepperoni;
        this.ham = ham;
    }

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public int getQuantityOfCheese() {
        return quantityOfCheese;
    }

    public void setQuantityOfCheese(int quantityOfCheese) {
        this.quantityOfCheese = quantityOfCheese;
    }

    public int getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(int pepperoni) {
        this.pepperoni = pepperoni;
    }

    public int getHam() {
        return ham;
    }

    public void setHam(int ham) {
        this.ham = ham;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", quantityOfCheese=" + quantityOfCheese +
                ", pepperoni=" + pepperoni +
                ", ham=" + ham;
    }

    public int calcPizza(){
        int price;

        if(size == PizzaSize.SMALL){
            price = 10;
        }
        else if(size == PizzaSize.MEDIUM){
            price = 12;
        }
        else if(size == PizzaSize.LARGE){
            price = 14;
        }
        else{
            System.out.println("Такого размера пиццы не существует");
            return 0;
        }
        return price + (getQuantityOfCheese() * 2) + (getPepperoni()*2) + (getHam() * 2);
    }
}
