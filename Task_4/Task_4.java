package Task_4;

import java.util.InputMismatchException;
import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int number = getPositiveNumber(scanner);

            if (number <= 0) {
                System.out.println("Please enter a positive number.");
                return;
            }

            int sum = calculateSum(number);

            System.out.println("The sum of numbers from 1 to " + number + " = " + sum);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid positive number.");
        }
    }

    private static int getPositiveNumber(Scanner scanner) {
        System.out.println("Enter a positive number:");
        return scanner.nextInt();
    }

    private static int calculateSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
}