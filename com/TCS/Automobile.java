package com.TCS;

import java.util.Scanner;

public class Automobile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vehicles, wheels;
        vehicles = input.nextInt();
        wheels = input.nextInt();
        find2w4W(vehicles, wheels);
    }

    public static void find2w4W(int v, int w){
        if (w < 2 || w % 2 != 0 || v >= w) {
            System.out.println("Invalid Input");
            System.exit(1);
        }
        int fourWheeler = (w - 2 * v) / 2;
        int twoWheeler = v - fourWheeler;
        System.out.println(twoWheeler + " " + fourWheeler);
    }
}
