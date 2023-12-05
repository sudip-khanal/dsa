
//Some basic function and operations of ArrayList

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ExampleArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        // add
        list.add(0);
        list.add(4);
        list.add(3);
        list.add(5);
        System.out.println(list);

        // get
        int element = list.get(2);
        System.out.println(element);

        // delete
        list.remove(3);
        System.out.println(list);

        // add element in between
        list.add(2, 6);
        System.out.println(list);

        // set element
        list.set(0, 1);
        System.out.println(list);
        // size of list
        int size = list.size();
        System.out.println("size of list is :" + size);

        // loops
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // sort
        Collections.sort(list);
        System.out.println(list);

    }

}
