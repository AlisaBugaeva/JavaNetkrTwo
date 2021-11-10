package com.mycompany.chapter1;

import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Binary: "+ Integer.toBinaryString(n));
        System.out.printf("Octal: %o \n", n);
        System.out.printf("Hexadecimal: %X \n", n);
        System.out.printf("The reciprocal as a hexadecimal floating-point: %A", (1/(float)n));
    }
}
