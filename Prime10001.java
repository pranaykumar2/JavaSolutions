public class Prime10001 {
    public static void main(String[] args) {
        int num = prime10001(10001);
        System.out.println(num);
    }
    public static int prime10001(int n) {
        int count = 0;
        int num = 1;
        while(count < n) {
            num++;
            if(SummationofPrimes.isPrime(num)) {
                count++;
            }
        }
        return num;
    }
}
