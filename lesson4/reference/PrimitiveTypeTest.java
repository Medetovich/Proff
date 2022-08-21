package lesson4.reference;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveTypeTest {
    @Test
    public void example1(){
        int a = 8;
        System.out.println("before modify : " + a);
        modified(a);
        System.out.println("after modify : " + a);
    }
    private static void modified(int a){
        a += 100;
        System.out.println("inside modify : " + a);
    }

    public static void main(String[] args) {
        int t = 50;
        Integer a1 = new Integer(t);
        Integer a2 = t; // boxing - иициализация ссылочного типа по примитивному

        List<Integer> intList = new ArrayList<>();

        if (a2 < 200) // unboxing - сравнение ссылочного типа с примитивным
        {
            System.out.println("it's less");
        }

        if (a1 == a2) // эквивалентность для ссылочных сравнивает их по адресу в памяти
        // указывают ли эти ссылки на один и тот же объект
        {
            System.out.println("==");
        } else
            System.out.println("!=");
        if (a1.equals(a2)) {
            System.out.println("equals");
        }
    }

    }

