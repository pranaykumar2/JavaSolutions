package com.TCSNQT;
import java.util.Scanner;

public class GCDLCMCalculator {
    public static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
    
    public static int findLCM(int num1, int num2) {
        int gcd = findGCD(num1, num2);
        return Math.abs((num1 * num2) / gcd);  
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        
        int gcd = findGCD(num1, num2);
        int lcm = findLCM(num1, num2);
        
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
        
        input.close();
    }
}
