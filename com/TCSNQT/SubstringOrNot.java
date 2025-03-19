package com.TCSNQT;

import java.io.*;

public class SubstringOrNot {
    static void isSubstring(String str, String subStr) {
        if (str.contains(subStr)) {
            System.out.println("Substring");
        } else {
            System.out.println("Not a Substring");
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        String str = br.readLine();
        String subStr = br.readLine();
        isSubstring(str, subStr);
    }
}
