package lesson4.Animals;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public String greets() {
        return "Meouw";
    }
}
