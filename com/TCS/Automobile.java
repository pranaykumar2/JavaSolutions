package com.TCS;

import java.util.Scanner;

public class Automobile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalVehicles, totalWheels;
        totalVehicles = input.nextInt();
        totalWheels = input.nextInt();
        find2w4W(totalVehicles, totalWheels);
    }

    public static void find2w4W(int totalVehicles, int totalWheels){
        int fourWheeler  = (totalWheels - 2 * totalVehicles)/2;
        int twoWheeler = (totalWheels - 4 * fourWheeler)/2;
        System.out.println(twoWheeler + " " + fourWheeler);
    }
}
