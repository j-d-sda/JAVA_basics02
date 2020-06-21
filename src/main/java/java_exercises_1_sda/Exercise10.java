package java_exercises_1_sda;

public class Exercise10 {
    public static int mod(int n1, int n2) {
        return n1 - (n1/n2)*n2;
    }

    public static boolean checkMod(int n1, int n2) {
        if (mod(n1, n2) == (n1 % n2))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println(checkMod(a, b));
    }
}
