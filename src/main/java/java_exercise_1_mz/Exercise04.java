package java_exercise_1_mz;

import java.util.ArrayList;

public class Exercise04 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Jacek :-)");
        arrayList.add("Marta");
        arrayList.add("Grzegorz");
        arrayList.add("Paweł");
        arrayList.add("Piotr");

        System.out.println("Elements in array list in normal order:");
        for (String name : arrayList) {
            System.out.println(name);
        }

        int n = arrayList.size();

        System.out.println("Elements in array list in reverse order:");
        for(int i = n-1; i >= 0; i--) {
            System.out.println(arrayList.get(i));
        }
    }
}
