package java_exercises_1_sda;

public class Exercise09 {
    public static int mod(int n1, int n2) {
        return n1 - (n1/n2)*n2;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println(mod(a, b));
    }
}
