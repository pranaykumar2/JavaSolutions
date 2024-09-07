import java.util.Scanner;

public class AlternativeChar {
    //A = abcd
    //B = efgh
    //Output = aebfcgdh
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A = input.next();
        String B = input.next();
        char[] arrA = A.toCharArray();
        char[] arrB = B.toCharArray();
        generatePassword(arrA, arrB);
    }

    public static void generatePassword(char[] A, char[] B) {
        int size = A.length + B.length;
        int index = 0, i ,j;
        char[] password = new char[size];

        for(i = 0, j = 0; index < size ; i++, j++) {
            if(i < A.length) {
                password[index] = A[i];
                index++;
            }
            if(j < B.length) {
                password[index] = B[i];
                index++;
            }
        }

        for(char c : password) {
            System.out.print(c);
        }
    }
}
