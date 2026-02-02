public class PrintPattern1 {
    public static void main(String[] args) {

        int size = Integer.parseInt(args[0]);

        // Outer loop for rows
        for (int row = 1; row <= size; row++) {

            // Inner loop for columns
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }

            // New line after each row
            System.out.println();
        }
    }
}

