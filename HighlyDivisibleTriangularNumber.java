public class HighlyDivisibleTriangularNumber {
    public static void main(String[] args) {
        int trianglenumber = highlyDivisibleTriangularNumber(500);
        System.out.println(trianglenumber);
    }

    public static int highlyDivisibleTriangularNumber(int divisors) {
        int num = 1;
        int sum;
        while(true) {
            sum = sumOfNaturalNumbers(num);
            int total_divisors = numOfDivisors(sum);
            if(total_divisors >= divisors){
                break;
            }
            num += 1;
        }
        return sum;
    }

    public static int sumOfNaturalNumbers(int n) {
        return n * (n + 1) / 2;
    }

    public static int numOfDivisors(int num) {
        int count = 0;
        for(int i = 1; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                count += (i == num / i) ? 1 : 2;
            }
        }
        return count;
    }
}