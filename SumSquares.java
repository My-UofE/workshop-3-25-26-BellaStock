public class SumSquares {
    public static void main(String[] args) {

        int startNum = Integer.parseInt(args[0]);
        int endNum = Integer.parseInt(args[1]);

        int i = startNum;
        int sum = 0;

        while (i <= endNum) {
            sum += i * i;
            i++;
        }

        System.out.println("Sum of squares from " + startNum + " to " + endNum + ":");
        System.out.println(sum);
    }
}
