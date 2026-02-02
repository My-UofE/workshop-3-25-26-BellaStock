import java.util.Scanner;

public class PrintPattern2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        if (size < 1) {
            System.out.println("too small!");
            return;
        }

        if (size > 5) {
            System.out.println("too big!");
            return;
        }

        int totalRows = size * 2;

        for (int row = 0; row < totalRows; row++) {
            int currentRow = (row < size) ? row : (2 * size - row - 1);

            for (int i = 1; i <= size; i++) {
                System.out.print(currentRow + i);
            }
            for (int i = size; i >= 1; i--) {
                System.out.print(currentRow + i);
            }
            System.out.println();
        }
    }
}


