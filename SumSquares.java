import java.util.Scanner;

public class SumSquares {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int startNum = in.nextInt();
        int endNum = in.nextInt();

        int sum = 0;
        int i = startNum;

        while (i <= endNum) {
            sum += i * i;
            i++;
        }

        System.out.println("Sum of squares from " + startNum + " to " + endNum + ":");
        System.out.println(sum);
    }
}

