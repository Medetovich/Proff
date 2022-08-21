package lesson4.Animals;

public class Tester {
    public static void main(String[] args) {
        Dog b = new Dog("Simba");
        Dog alpha = new Dog("Alpha");
        alpha.greets();
        alpha.greets(b);
        BigDog big = new BigDog("Balto");
        BigDog big1 = new BigDog("Feniks");
        big.greets(big1);
    }
}
