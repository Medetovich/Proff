package ArrayListexampl;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Nikita");
        arrayList1.add("Vika");
        System.out.println(arrayList1);

//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("Kolya");
//        arrayList2.add("Nikita");
//        arrayList2.add("Mariya");

//        arrayList1.retainAll(arrayList2);
  //      System.out.println(arrayList1);
//        System.out.println(arrayList1.containsAll(arrayList2));
//        List<String> myList=arrayList1.subList(1,3);
//        System.out.println(myList);
//        Object [] array = arrayList1.toArray();
//        String [] array2 = a rrayList1.toArray(new String[0]);
//        for(String s:array2){
//            System.out.println(s);
//        }
        List<Integer> list1 = List.of(3,8,13);
        System.out.println(list1);

    }

}
