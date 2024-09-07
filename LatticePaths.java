import java.lang.Math;


public class LatticePaths {
    public static void main(String[] args) {
        latticePaths(20);
    }

    public static void latticePaths(int num) {
        int result = (int) Math.pow(num, num) + num;
        System.out.println(result);
    }
}
