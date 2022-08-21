package lesson4.Animals;

public class BigDog extends Animal{
    public BigDog(String name) {
        super(name);
    }

    @Override
    public String greets() {
        return "Gaf";
    }
    public String greets(Dog a){
        return "GafGaf";
    }
    public String greets(BigDog a){
        return "GAFGAFGAF";
    }
}
