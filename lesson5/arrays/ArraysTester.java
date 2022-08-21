package lesson5.arrays;

public class ArraysTester {
    public static void main(String[] args) {
        int [] a = new int []{1, 5, 6 , 4};
        String [] b = {"red", "green", "blue"};
        double [] c = new double[10];

        // ссылочные типы инициализируются null

        // длина
        System.out.println(b.length);

        // обращение по индексу
        System.out.println(b[1]);

        // изменение по индексу
        b[2] = "gray";

            }
}
