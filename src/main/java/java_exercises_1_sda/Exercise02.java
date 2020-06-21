package java_exercises_1_sda;

import java.util.Scanner;

public class Exercise02 {
    public static boolean isPrime(int number) {
        int i;

        for(i = 2; i < number/2; i++) {
            if (number % 2 == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        n = scanner.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " jest liczba pierwszza.");
        }
        else
            System.out.println(n + " nie jest liczba pierwsza.");
    }
}
