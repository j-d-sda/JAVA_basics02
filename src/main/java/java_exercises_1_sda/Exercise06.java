package java_exercises_1_sda;

public class Exercise06 {
    public static int getNumberOfNegativeValues(int[] array) {
        int n = 0;

        for (int value : array) {
            if (value < 0) {
                n++;
            }
        }

        return n;
    }

    public static void displayAllArrayElements(int[] array, String separator) {
        for (int n : array) {
            System.out.print(n + separator);
        }
        System.out.println();
    }


    public static int[] createNegativeValuesArray(int[] array) {
        int n = getNumberOfNegativeValues(array);
        int[] arrayOfNegativeValues = new int[n];

        if (n > 0) {
            int i = 0;

            for (int value : array) {
                if (value < 0) {
                    arrayOfNegativeValues[i++] = value;
                }
            }
        }

        return arrayOfNegativeValues;
    }


    public static void main(String[] args) {
        int[] array = {12, -7,  19, -23, 107};
        //int[] array = {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2;
        int numOfNegVal = 0;
        int i = 0;

        System.out.println("Original array: ");
        displayAllArrayElements(array, " ");

        numOfNegVal = getNumberOfNegativeValues(array);
        System.out.println("Number of negative values in array: " + numOfNegVal);

        if (numOfNegVal > 0) {
            array2 = createNegativeValuesArray(array);
            /*
            array2 = new int[numOfNegVal];
            for (int value : array) {
                if (value < 0) {
                    array2[i++] = value;
                }
            }
            */
            displayAllArrayElements(array2, " ");
        }
    }
}

