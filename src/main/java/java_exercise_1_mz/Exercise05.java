package java_exercise_1_mz;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Exercise05 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jacek :-)", "Marta", "Grzegorz", "Paweł", "Piotr");

        Iterator<String> namesIterator = names.iterator();

        while(namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }
    }
}