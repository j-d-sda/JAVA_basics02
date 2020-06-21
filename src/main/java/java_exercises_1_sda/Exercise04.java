package java_exercises_1_sda;

public class Exercise04 {
    public static void displayAllArrayElements(int[] array, String separator) {
        for (int n : array) {
            System.out.print(n + separator);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {12, 7,  19};
        int temp;

        System.out.println("Original array: ");
        displayAllArrayElements(array, " ");

        temp = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = temp;

        System.out.println("Array after switching first and last element: ");
        displayAllArrayElements(array, " ");
    }
}
