package Task_5;

import java.util.Arrays;
import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continueExecution = true;
            int[] results = new int[0];

            while (continueExecution) {
                System.out.println("Enter the first number:");
                int num1 = scanner.nextInt();

                System.out.println("Enter the second number:");
                int num2 = scanner.nextInt();

                int result = multiply(num1, num2);
                System.out.println("The result of multiplication: " + result);

                results = addToResults(results, result);

                System.out.println("To finish, enter 1, to continue, enter any other number:");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    continueExecution = false;
                }
            }

            System.out.println("Sorted results: " + Arrays.toString(sortResults(results)));
        }

        System.out.println("The program has completed execution.");
    }

    private static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    private static int[] addToResults(int[] array, int value) {
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[array.length] = value;
        return newArray;
    }

    private static int[] sortResults(int[] array) {
        Arrays.sort(array);
        return array;
    }
}