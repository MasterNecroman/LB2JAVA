package Task_3;

public class MultiplicationTable {
    private static final int SIZE = 10;

    public static void main(String[] args) {
        System.out.println("Multiplication Table " + SIZE + "x" + SIZE + ":\n");

        System.out.print("  |");
        for (int i = 1; i <= SIZE; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n--+--------------------------------------");

        for (int i = 1; i <= SIZE; i++) {
            System.out.printf("%2d|", i);
            for (int j = 1; j <= SIZE; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}