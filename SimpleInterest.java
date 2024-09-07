public class SimpleInterest {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println(simpleInterest);
    }
}
