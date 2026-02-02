public class AverageSquares {
    public static void main(String[] args) {

        int startNum = Integer.parseInt(args[0]);
        int endNum = Integer.parseInt(args[1]);

        int i = startNum;
        int sum = 0;
        int count = 0;

        do {
            sum += i * i;
            count++;
            i++;
        } while (i <= endNum);

        double average = (double) sum / count;

        System.out.println("Average of squares from " + startNum + " to " + endNum + ":");
        System.out.println(average);
    }
}
