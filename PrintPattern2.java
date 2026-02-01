import java.util.Scanner;

public class PrintPattern2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size;

        // Input validation
        do {
            System.out.print("Enter the size: ");
            size = in.nextInt();

            if (size < 1) {
                System.out.println("too small!");
            } else if (size > 5) {
                System.out.println("too big!");
            }
        } while (size < 1 || size > 5);

        int totalRows = size * 2;

        // Loop over rows
        for (int row = 0; row < totalRows; row++) {

            // Mirror rows for bottom half
            int currentRow = (row < size) ? row : (2 * size - row - 1);

            // Increasing part
            for (int i = 1; i <= size; i++) {
                System.out.print(currentRow + i);
            }

            // Decreasing part
            for (int i = size; i >= 1; i--) {
                System.out.print(currentRow + i);
            }

            System.out.println();
        }
    }
}
