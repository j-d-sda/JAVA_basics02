package java_exercise_1_mz;

import java.util.ArrayList;

public class Exercise03 {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<Double>();

        arrayList.add(0.1);
        arrayList.add(-0.2);
        arrayList.add(0.3);
        arrayList.add(-0.4);
        arrayList.add(0.5);
        arrayList.add(-0.6);
        arrayList.add(0.7);
        arrayList.add(-0.8);
        arrayList.add(0.9);
        arrayList.add(-1.0);

        System.out.println("Current number elements in array list: " + arrayList.size());
        System.out.println("First element in array list: " + arrayList.get(0));
        System.out.println("Last element in array list: " + arrayList.get(arrayList.size()-1));

        System.out.println(arrayList.get(0) + " + " + arrayList.get(arrayList.size()-1) + " = " + (arrayList.get(0) + arrayList.get(arrayList.size()-1)));
        System.out.println(arrayList.get(0) + " * " + arrayList.get(arrayList.size()-1) + " = " + (arrayList.get(0) * arrayList.get(arrayList.size()-1)));
        System.out.println(arrayList.get(1) + " / " + arrayList.get(arrayList.size()-2) + " = " + (arrayList.get(1) / arrayList.get(arrayList.size()-2)));
    }
}
