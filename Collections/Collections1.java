package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Collections1 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(-2);
        array.add(19);
        array.add(24);
        array.add(-5);
        array.add(-10);
        array.add(180);
        array.add(140);
        array.add(222);
        array.add(90);
        array.add(-180);
        array.add(-200);
        Collections.sort(array);
        int index1 = Collections.binarySearch(array,180);
        System.out.println(index1);


    }

}
