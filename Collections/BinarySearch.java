package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
//        Employee emp1 = new Employee(100,"Zaur", 12000);
//        Employee emp2 = new Employee(1,"Vitya", 7000);
//        Employee emp3 = new Employee(5,"Arthur", 8900);
//        Employee emp4 = new Employee(2,"Boris", 10000);
//        Employee emp5 = new Employee(10,"Irina", 9100);
//        Employee emp6 = new Employee(20,"Genadii", 11400);
//        Employee emp7 = new Employee(120,"Kirill", 5000);
//        List<Employee> empl = new ArrayList<>();
//        empl.add(emp1);
//        empl.add(emp2);
//        empl.add(emp3);
//        empl.add(emp4);
//        empl.add(emp5);
//        empl.add(emp6);
//        empl.add(emp7);
//        System.out.println(empl);
//        Collections.sort(empl);
//        System.out.println(empl);
//        int index2 = Collections.binarySearch(empl,
//                new Employee(20,"Genadii", 0));
//        System.out.println(index2);
        int [] array = {-3,15,4,2,56,32,6,23,49,8765,423,342,31,27,48};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index3 = Arrays.binarySearch(array,49);
        System.out.println(index3);
    }

}
class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private int salary;

    public Employee (int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary;
    }

    @Override
    public int compareTo(Employee o) {
        int res = this.id - o.id;
        if(res==0){
            res = this.name.compareTo(o.name);
        }

        return res;
    }
}

