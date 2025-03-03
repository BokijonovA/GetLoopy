import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1: Count up by 1 from 0 to 30");
        for (int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("Task 2: Count down by 1 from 30 to 0");
        for (int i = 30; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("Task 3: Count up by 3 from 0 to 18");
        for (int i = 0; i <= 18; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("Task 4: Count down by 2 from 10 to 0");
        for (int i = 10; i >= 0; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("Task 5: Right-aligned Triangle");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Task 6: Inverted Triangle");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Task 7: Square");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Task 8: Die Roller");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean keepRolling = true;

        while (keepRolling) {
            int rollCount = 0;
            int die1, die2, die3;

            System.out.println("Roll\tDie1\tDie2\tDie3\tSum");
            System.out.println("--------------------------------");

            do {
                rollCount++;
                die1 = random.nextInt(6) + 1;
                die2 = random.nextInt(6) + 1;
                die3 = random.nextInt(6) + 1;
                System.out.printf("%d\t%d\t%d\t%d\t%d\n", rollCount, die1, die2, die3, die1 + die2 + die3);
            } while (!(die1 == die2 && die2 == die3));

            System.out.println("Triple achieved!");

            System.out.print("Roll again? (y/n): ");
            String response = scanner.next();
            keepRolling = response.equalsIgnoreCase("y");
        }
        scanner.close();
    }
}
