package ss8_arraylist_linkedlist.exercise;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        CustomArrayList <Integer> arrayList = new CustomArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(0,9);
        arrayList.add(6);

        arrayList.remove(1);
        arrayList.get(0);
        System.out.println(arrayList.size());
        System.out.println(arrayList.indexOf(0));

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));

        }
       arrayList.clear();
        System.out.println(arrayList.size());






    }
}



