public class EvenFibonacciNumbers {
    /*
    * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
    * By starting with 1 and 2, the first 10 terms will be: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,...
    * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
    * find the sum of the even-valued terms.
    * */

    public static void main(String[] args) {
        int num = sumFibonacciEven(4000000);
        System.out.println(num);
    }

    public static int sumFibonacciEven(int n) {
        int sum = 0;
        for(int i = 1, j = 2; i <= n; j += i, i = j - i) {
            if(i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
