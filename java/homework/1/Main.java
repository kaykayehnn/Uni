import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        boolean isTriangle = (a + b) > c && (a + c) > b && (b + c) > a;
        if (!isTriangle) {
          System.out.println("Не съществува триъгълник с дадените страни.");
          return;
        }

        if(a == b && a == c) {
          System.out.println("Триъгълникът е равностранен.");
        } else if (a == b || a == c || b == c) {
          System.out.println("Триъгълникът е равнобедрен.");
        } else {
          System.out.println("Триъгълникът е разностранен.");
        }
        
        double[] sides = { a, b, c };
        Arrays.sort(sides);

        if (Math.hypot(sides[0], sides[1]) == sides[2]) {
          System.out.println("Триъгълникът е правоъгълен.");
        }
    }
}