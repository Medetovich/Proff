package lesson4.reference;

import org.junit.Test;

public class ChangeReferenceTest {
    @Test
    public void example(){
        Person p = new Person("Max");
        System.out.println("before modify: " + p.getName());
        modify(p);
        System.out.println("after modify: " + p.getName());
    }

    public static void modify(Person p){
        p = new Person ("Alex");
        //p.setName("Alex");

        System.out.println("in Modify: " + p.getName());
    }
}
