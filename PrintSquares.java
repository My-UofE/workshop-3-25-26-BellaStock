import java.util.Scanner;

public class PrintSquares {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int startNum = in.nextInt();
        int endNum = in.nextInt();

        System.out.println("Sequence of squares from " + startNum + " to " + endNum + ":");

        for (int i = startNum; i <= endNum; i++) {
            System.out.print((i * i) + " ");
        }

        System.out.println();
    }
}

