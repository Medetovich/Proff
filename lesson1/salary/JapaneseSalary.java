package lesson1.salary;

import jdk.swing.interop.SwingInterOpUtils;

public class JapaneseSalary {
    public static void main(String[] args) {
        System.out.println(calculateSalary(50_000, 20_000, 30));
        SalaryCalculator calc = new SalaryCalculator(50000, 20000);
        System.out.println(calc.calculate(15));
    }

    public static double calculateSalary(double baseSalary, double coeff, int years){
        return baseSalary + coeff * years;
    }
}
