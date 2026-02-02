public class PrintSquares {
    public static void main(String[] args) {

        int startNum = Integer.parseInt(args[0]);
        int endNum = Integer.parseInt(args[1]);

        System.out.println("Sequence of squares from " + startNum + " to " + endNum + ":");

        for (int i = startNum; i <= endNum; i++) {
            System.out.print((i * i) + " ");
        }

        System.out.println(); // newline at the end
    }
}
