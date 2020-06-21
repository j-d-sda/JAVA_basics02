package java_exercises_1_sda;

public class Exercise01 {
    public static void showMultiplicationTablePart(int number1, int number2, int number3) {
        int i;

        for(i = number2; i <= number3; i++) {
            System.out.println(number1*i);
        }
    }

    public static void main(String[] args) {
        showMultiplicationTablePart(5, 1, 4);
    }
}
