import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static boolean isPerfect(int number) {
        if (number <= 1) {
            return false;
        }

        int divisorSum = 1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                divisorSum += i;
                if (i * i != number) {
                    divisorSum += number / i;
                }
            }
        }

        return divisorSum == number;
    }

    private static void findPerfect(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPerfect(i)) {
                System.out.println(i + " е перфектно число.");
            }
        }
    }
    
    private static void findSumAndAverage(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }

        double average = (double) sum / (end - start + 1);
        System.out.println(String.format("Сумата на числата в интервала [%d, %d] е %d", start, end, sum));
        System.out.println(String.format("Средната стойност на числата в интервала [%d, %d] е %f", start, end, average));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int choice = in.nextInt();
        while (choice != 0) {
          int start = in.nextInt();
          int end = in.nextInt();
          if (choice == 1) {
            findPerfect(start, end);
          } else if (choice == 2) {
            findSumAndAverage(start, end);
          } else {
              System.out.println("Невалиден избор: " + choice);
          }

          choice = in.nextInt();
        }
    }
}