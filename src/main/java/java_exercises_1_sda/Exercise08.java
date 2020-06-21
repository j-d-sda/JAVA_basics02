package java_exercises_1_sda;

public class Exercise08 {
    public static boolean isArithmeticalProgression(int[] array) {
        if (array.length < 2) {
            return false;
        }

        int diff = array[1] - array[0];

        for(int i = 1; i < array.length-1; i++) {
            if (array[i+1] - array[i] != diff)
                return false;
        }

        return true;
    }

    public static void displayAllArrayElements(int[] array, String separator) {
        for (int n : array) {
            System.out.print(n + separator);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};

        System.out.println("Original array: ");
        displayAllArrayElements(array, " ");

        if (isArithmeticalProgression(array)) {
            System.out.println("Values in array are values of arithmetical progression.");
        } else {
            System.out.println("Values in array are NOT values of arithmetical progression.");
        }
    }
}
