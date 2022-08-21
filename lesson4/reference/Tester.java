package lesson4.reference;

public class Tester {
    public static void main(String[] args) {
        // boolean int float short byte  примитивные типы в стэке функции
        boolean a; // false
        //  0  присваиваются по умолчанию ноль и в булинге фальш

        // рефересные типы  reference types ссылочные типы
        // Class [] @Test interface enum String  в хипе heap
        // примитивные типы встроенны в джаву

        String c = null;
        Person p = new Person("Max");
        System.out.println(c);

    }
}

class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
