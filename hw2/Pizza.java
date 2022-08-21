package hw2;

public class Pizza {
    String size;

    int quantityOfCheese;
    int pepperoni;
    int ham;

    public Pizza(String size, int quantityOfCheese, int pepperoni, int ham) {
        this.size = size;
        this.quantityOfCheese = quantityOfCheese;
        this.pepperoni = pepperoni;
        this.ham = ham;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
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
        String a = getSize().toLowerCase();
        if(a.equals("small")){
            price = 10;
        }
        else if(a.equals("medium")){
            price = 12;
        }
        else if(getSize().equals("large")){
            price = 14;
        }
        else{
            System.out.println("Такого размера пиццы не существует");
            return 0;
        }
        return price + (getQuantityOfCheese() * 2) + (getPepperoni()*2) + (getHam() * 2);
    }
}
