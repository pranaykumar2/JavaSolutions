import java.util.Scanner;

public class BinaryToGray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String binaryString = input.next();
        int binary = Integer.parseInt(binaryString, 2);
        int gray = binaryToGray(binary);
        System.out.println(Integer.toBinaryString(gray));
    }

    public static int binaryToGray(int binary) {
        return binary ^ (binary >> 1);
    }
}