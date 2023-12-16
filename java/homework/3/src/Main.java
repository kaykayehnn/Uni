import java.util.Scanner;

public class Main {
    public static int fibonacciRecursive(int n) {
        if (n == 0 || n == 1) return 1;

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void fibonacciRecursiveLoop(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println();
    }
    public static void fibonacciIterative(int n) {
        int a = 1;
        int b = 0;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            b = a;
            a = c;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Колко числа на Фибоначи да ви покажа?");

        int n = scanner.nextInt();

        System.out.println("Iterative:");
        fibonacciIterative(n);

        System.out.println("Recursive:");
        fibonacciRecursiveLoop(n);
    }
}