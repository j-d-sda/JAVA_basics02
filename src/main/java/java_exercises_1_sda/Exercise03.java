package java_exercises_1_sda;

public class Exercise03 {
    public static int sum(int n1, int n2) {
        int i, sum = 0;

        for(i = n1; i <= n2; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(73, 97));
    }
}
