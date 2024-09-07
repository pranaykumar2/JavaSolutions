public class SpecialPythagoreanTriplet {
    /*
    * A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,
    * a^2 + b^2 = c^2.
    * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
    * There exists exactly one Pythagorean triplet for which a + b + c = 1000.<br>Find the product abc.
    * */

    public static void main(String[] args) {
        pythagoreanTriplet(1000);
    }

    public static void pythagoreanTriplet(int sum) {
        int a, b, c;
        for(a = 2; a < sum /2; a++) {
            for(b = a + 1; b < sum / 2; b++) {
                c = sum - a - b;
                if ((a*a) + (b*b) == c*c) {
                    System.out.println(a * b * c);
                    return;
                }
            }
        }
    }
}
