package java_exercises_1_sda;

public class Exercise07 {
    public static void displayArithmeticalProgressionValues(int n, int a, int diff, String separator) {
        for(int i = 0; i < n; i++) {
            System.out.print(a + diff*i + separator);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        displayArithmeticalProgressionValues(5, 1, 2, " ");
    }
}
