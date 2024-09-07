import java.util.*;

class LongDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        while (testCases-- > 0) {
            int paulTime = calculateTime(input);
            int ninaTime = calculateTime(input);

            String result = (paulTime < ninaTime) ? "PAUL" :
                    (paulTime > ninaTime) ? "NINA" : "BOTH";
            System.out.println(result + "\n" + Math.min(paulTime, ninaTime));
        }
    }

    private static int calculateTime(Scanner input) {
        return input.nextInt() / input.nextInt() + input.nextInt();
    }
}