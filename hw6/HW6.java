package hw6;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW6 {

/*    Напишите функцию, которая последовательно сравнивает между собой элементы из двух передаваемых в нее списков одинаковой длины. Если все элементы в списках попарно одинаковы, возвращает true. Пример: {1,2,3}, {4,5,6} -> false; {1,2}, {1,2} -> true; {1,2}, {2,1} -> false
    Напишите функцию, которая последовательно сравнивает элементы двух передаваемых в нее списков одинаковой длины и возвращает список строк. Пример: {1,2,3}, {1,4,3}->{"Yes", "No", "Yes"}
* Напишите функцию которая получает на вход список строк и возвращает либо самую короткую либо саму длинную, в зависимости от того, какая встретилась раньше.
* Напишите функцию, которая удаляет дубликаты из передаваемого в нее массива строк.*/
public static void main(String[] args) {
    List<String> s = Arrays.asList("Tandy","Maxjhkjlkli", "Smithoipop", "Tandy", "ger", "Michael", "Azil");
    FunctionList f = new FunctionList();
    System.out.println(f.removeDuplicate(s));
    System.out.println(f.maxOrMin(s));
    List<Integer> i = Arrays.asList(12,12,23,53,56,32,7,4,23);
    List<Integer> ii = Arrays.asList(12,12,23,53,56,32,7,4,23);
    List<Integer> w = Arrays.asList(12,12,25,55,5436,342,7,4,3);
    System.out.println(f.YesNo(i, w));
    System.out.println(f.equalsOfTwolists(i,ii));
}
}
