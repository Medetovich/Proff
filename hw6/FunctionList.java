package hw6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FunctionList {
    public boolean equalsOfTwolists(List<Integer> a, List<Integer> b) {
        if (a.size() != b.size()) {
            System.out.println("Не совпадает кол-во элементов в списках");
            return false;
        } else {
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) != b.get(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public List<String> YesNo(List<Integer> a, List<Integer> b) {
        List<String> s = new ArrayList<>();
        if (a.size() != b.size()) {
            System.out.println("Не совпадает кол-во элементов в списках");
            return s;
        } else {
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) != b.get(i)) {
                    s.add("NO");
                } else {
                    s.add("YES");
                }
            }
        }
        return s;
    }

    public String maxOrMin(List<String> a){
        int max=0;
        int min=a.get(0).length();
        int result;
        int resultMax = 0;
        int resultMin = 0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).length() > max){
                resultMax = i;
                max = a.get(i).length();
            }
            if(min>a.get(i).length()){
                resultMin = i;
            }
        }
        if(resultMax < resultMin){
            result = resultMax;
        }else
            result = resultMin;
    return a.get(result);
    }

    public List<String> removeDuplicate(List<String> a){
        HashSet<String> h = new HashSet<>();
        for (int i = 0; i <a.size() ; i++) {
            h.add(a.get(i));
        }
        List<String> result = new ArrayList<>();
        result.addAll(h);

        return result;
    }
}
