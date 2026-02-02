public class PrintPattern2 {
    public static void main(String[] args) {

        int size = Integer.parseInt(args[0]);

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

