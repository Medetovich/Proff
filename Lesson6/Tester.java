package Lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static List<String> filter4(List<String> names){
        List<String> s = new ArrayList<>();
        for (String i: names)
        {
            if(i.length() > 4){
                s.add(i);
            }

        }
    return s;
    }

    public static void main(String[] args) {
        List<String> s = Arrays.asList("Max", "Smith", "Tandy", "Roger", "Michael", "Alexandra");
        System.out.println(filter4(s));
    }
}
