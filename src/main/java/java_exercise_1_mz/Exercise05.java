package java_exercise_1_mz;

import java.util.ArrayList;

public class Exercise05 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Jacek :-)");
        arrayList.add("Marta");
        arrayList.add("Grzegorz");
        arrayList.add("Paweł");
        arrayList.add("Piotr");

        System.out.println("Elements in array list in normal order:");

        int n = arrayList.size();
        int i = 0;

        while(i < n) {
            System.out.println(arrayList.get(i++));
        }
    }
}
