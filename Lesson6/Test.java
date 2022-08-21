package Lesson6;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static List<Address> getAddress(List<Person> persons){
        List<Address> addr = new ArrayList<>();
        for (int i = 0; i < persons.size(); i= i) {
            addr.add(persons.get(i).getAddress());
        }
        return addr;
    }
}
