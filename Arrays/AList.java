package Arrays;
import java.util.ArrayList;
import java.util.List;
//import java.util.*;
public class AList {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        ArrayList<Integer> list2 = new ArrayList<>(list);
        list2.addAll(list);
        System.out.println(list2);
        list2.add(1,100);
        System.out.println(list2);
        list2.addFirst(1);
        System.out.println(list2);
        list2.remove(0);
        System.out.println(list2);
        list2.contains(400);
        System.out.println(list2);

        List<Integer> List3 = list2.subList(2, 9);
        System.out.println(List3);
    }
}