package java_exercises_1_sda;

public class Exercise05 {
    public static int getMin(int[] array) {
        int min = array[0];

        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }

        return min;
    }

    public static int getMax(int[] array) {
        int max = array[0];

        for (int value : array) {
            if (value > max) {
                max  = value;
            }
        }

        return max;
    }

    public static void displayAllArrayElements(int[] array, String separator) {
        for (int n : array) {
            System.out.print(n + separator);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {12, 7,  19};

        System.out.println("Original array: ");
        displayAllArrayElements(array, " ");

        System.out.println("Array minimum value: " + getMin(array));
        System.out.println("Array maximum value: " + getMax(array));
    }
}
