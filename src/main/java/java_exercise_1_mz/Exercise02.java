package java_exercise_1_mz;

import java.util.ArrayList;

public class Exercise02 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        System.out.println("Current number elements in array list: " + arrayList.size());
        System.out.println("First element in array list: " + arrayList.get(0));
        System.out.println("Last element in array list: " + arrayList.get(arrayList.size()-1));
    }
}
