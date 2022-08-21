package Lesson6;

import java.util.List;

public class Person {
    private List<Person> persons;
    private String name;
    private Address address;

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}
