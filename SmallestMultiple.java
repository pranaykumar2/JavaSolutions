public class SmallestMultiple {
    /*
    * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder
    * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
    * */
    public static void main(String[] args) {
        int num = smallestMultiple(20);
        System.out.println(num);
    }

    public static int smallestMultiple(int n) {
        int lcm = 1;
        for (int i = 2; i <= n; i++) {
            lcm = lcm(lcm, i);
        }
        return lcm;
    }

    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
