package lesson4.reference;

import lesson4.Animals.Cat;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCat {
    @Test
    public void testCat(){
        Cat c = new Cat("murz");
        assertEquals("Meouw",c.greets());
    }
}
