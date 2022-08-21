package Lesson2;

import lesson2.BankAccount;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankAccountTest {
    BankAccount dd = new BankAccount("12", "qwerty", 3200);
    BankAccount ddd = new BankAccount("1", "qwertys", 2600);
    @Test
    public void test(){
        assertEquals(dd.getBalance() - ddd.getBalance(), dd.transfer(ddd,2600));
    }

}
