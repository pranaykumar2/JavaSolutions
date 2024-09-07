public class LongestCollatzSequence {

    /*
                        ----------------------------------
                        Question: Longest Collatz Sequence
                        ----------------------------------

    * The following iterative sequence is defined for the set of positive integers:
    * n -> n/2 (n is even)
    * n -> 3n + 1 (n is odd)
    * Using the rule above and starting with 13, we generate the following sequence:
    * 13  40  20  10  5  16  8  4  2  1.
    * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
    * Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
    * Which starting number, under one million, produces the longest chain?
    * Once the chain starts the terms are allowed to go above one million.
    */

    public static void main(String[] args) {
        long num = longestCollatzSequence(1000000);
        System.out.println(num);
    }

    public static long longestCollatzSequence(long terms) {
        long maxLength = 0;
        long numberWithMaxLength = 0;
        for(int i = 1; i < terms; i++) {
            long length = collatzSequence(i);
            if(length > maxLength) {
                maxLength = length;
                numberWithMaxLength = i;
            }
        }
        return numberWithMaxLength;
    }

    public static long collatzSequence(long num) {
        long count = 1;
        while(num != 1) {
            if(num % 2 == 0) {
                num /= 2;
            }
            else {
                num = 3 * num + 1;
            }
            count += 1;
        }
        return count;
    }
}
