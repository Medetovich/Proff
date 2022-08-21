package lesson1.salary;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JapaneseSalaryTest {
    @Test
    public void testSalary(){
        assertEquals(
                650000,
                JapaneseSalary.calculateSalary(50_000, 20_000, 30),
                0.001);

    }

    @Test
    public void testSalaryClass(){
        SalaryCalculator sal = new SalaryCalculator(50000, 20000);
        assertEquals(650000, sal.calculate(30),0.001);
    }
}
